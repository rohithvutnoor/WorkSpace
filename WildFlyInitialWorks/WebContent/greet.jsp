<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page errorPage="error.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Rohith Vutnoor</title>
</head>
<body>
	<center>
	<h3>
		<%
			String data = request.getParameter("fname");
			if(data.equalsIgnoreCase("Lingesh")) {
				out.println("Hello "+data);
				session.setAttribute("user",data);
			}else{
				out.println("Hello The Wrong Guy");
				throw new RuntimeException("Error Data");
			}
		%>
	</h3>
		<% out.print("<h1>Hello Rohith  Vutnoor</h1>"); %>
		Date: <% out.print( new java.util.Date());
		%>
	</center>
</body>
</html>