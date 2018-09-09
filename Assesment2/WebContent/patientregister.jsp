<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ICare</title>
</head>
<body>

<h1> Register Patient!!</h1>

<form action = "PatientRegister" method = "post">
<input type = "text" placeholder = "Firstname" id = "firstname" name = "firstname">
<br>
<input type = "text" placeholder = "Lastname" id = "lastname" name = "lastname">
<br>
<input type = "text" placeholder = "Phone" id = "phone" name = "phone">
<br>
<input type = "text" placeholder = "Age" id = "age" name = "age">
<br>
<input type = "text" placeholder = "Address" id = "address" name = "address">
<br>
<a href = "patientlist.jsp"><input type = "submit" placeholder = "Register" id = "register" name = "register"></a>

</form>

</body>
</html> 