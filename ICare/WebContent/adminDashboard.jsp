<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page errorPage="error.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ICare</title>
</head>
<body>
	<form method="POST" action="registerPatient">
		<h4>Add Patient</h4>
		<input name = "patienName" type="text" placeholder="patientName">
		<input name = "cause" type="text" placeholder="Cause">
		<input name = "gender" type="text" placeholder="Gender">
		<input name = "age" type="text" placeholder="Age">
		<input type="submit" value="Submit">
	</form>
	<br>
	<!--
		//out.println("Successfully Added "+request.getAttribute("patient"));
	-->
	<br>
		<h3>
			<a href="viewRecords">View Case Records</a>
		</h3>
	<br>
	
	<div>
		Register
		DrugStore
		Case Records
		Daily Entries
		Eligibility Enquiry
		Expiry Alert
	</div>
</body>
</html>