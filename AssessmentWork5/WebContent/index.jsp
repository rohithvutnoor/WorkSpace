<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Rohith Vutnoor</title>
</head>
<body>
		<h2>Product Cart</h2>
		<form method="POST" action="loadCart"> 
			<input type="text" name="username"value=""/>
  			<select name="productName">
  				<option value="Apple">Apple</option>
  				<option  value="Orange">Orange</option>
  				<option value="Choco">Choco</option>
  			</select>    
  			<input type="text" name="quantity" value=""/>
    		<input type="submit" value="Add to Cart"/>
    	</form>
</body>
</html>