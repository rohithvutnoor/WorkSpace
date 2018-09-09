<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello</title>
</head>
<body>
	 <center><h2>${message}</h2></center>
	 	<form action="Addition" method="POST">
			1. <input type="text" id="no1" name="no1" value="0">
			2. <input type="text" id="no2" name="no2" value="0">
			<input type="submit" value="Submit">
		</form>
</body>
</html>