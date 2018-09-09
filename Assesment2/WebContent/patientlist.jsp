<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>

<form action="PatientList" method="get">
<input type="submit" value="Patient List">

</form>

<br>
<h1>Add new Drug!!</h1>

<form action = "DrugStore" method = "post">
<input type = "text" placeholder = "Drug Name" name = "name" id = "name">
<input type = "text" placeholder = "Quantity" name = "quantity" id = "quantity">
<input type = "submit" value = "Add">
</form>

<br>
<br>
<form action = "ListDrugs" method = "get">

<input type="submit" value="Drugs available">
</form>

<body>

</body>
</html>