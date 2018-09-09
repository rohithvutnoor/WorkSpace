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
	<div>
		<center>
			<form method="POST" action="authentication"><!-- Authenticate Servlet -->
				<h4>Admin Login</h4>
				<input name = "username" type="text" placeholder="username">
				<input name= "password" type="password" placeholder="password">
				<input type="submit" value="Submit">
			</form>
		</center>
	</div>
</body>
</html>