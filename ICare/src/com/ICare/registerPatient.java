package com.ICare;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/registerPatient")
public class registerPatient {
	private HttpSession session;

	public registerPatient() {
		super();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.getWriter().append("Server at: ").append(request.getContextPath());
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String username = request.getParameter("patientName");
		String cause = request.getParameter("cause");
		String gender = request.getParameter("gender");
		Integer age = Integer.parseInt(request.getParameter("age"));

		session = request.getSession(true);
        try {
            patientDao userDAO = new patientDao();
            userDAO.addUserDetails(username, cause, gender, age);
            //Set Attribute: Patient Name
            request.setAttribute("patient", username);
    		request.getRequestDispatcher("adminDashboard.jsp").forward(request, response);
            //response.sendRedirect("Success"); 
            System.out.println("Successfully Registered the Patient");
        } catch (Exception e) {
            e.printStackTrace();
        }
		//response.sendRedirect("index.jsp");
	}
}



/*
patientProfile p = new patientProfile();
int rs;
String insert = "insert into registration (uname, cause, gender, age)"
		+ "values("+username +","+cause+","+gender+","+age+");";
Connection con = null;

String dbUrl = "jdbc:mysql://localhost:3306/iCare";

try {
	Class.forName("com.mysql.jdbc.Driver").newInstance();
	con = DriverManager.getConnection(dbUrl, "root", "dbs123");
	System.out.println("Connected to the Database");

	PreparedStatement ps = con.prepareStatement(insert);
	System.out.println(insert);
	rs = ps.executeUpdate(insert);
	if(rs>0)
		System.out.println("Patient Registered in to the Database");
	else
		System.out.println("Unable to register the patient");
} catch (Exception e) {
	System.out.println("SQl Exception while patient Registration");
}*/