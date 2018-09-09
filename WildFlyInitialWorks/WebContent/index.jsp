<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "for" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page errorPage="error.jsp" %>
<%@ page import="java.util.*, java.io.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Rohith Vutnoor</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="keywords" content="Personal" />
		<link rel="icon" href="http://rohithvutnoor.info/images/icons/favicon.png">
</head>
<body>
<br>
		<center>
				<div>   					
				<br>
			<hr>
				<form name="myForm" action="/WildFlyWorks/greet.jsp" onsubmit="" method="post">
				Name: 	<input type="text" name="fname">
						<input type="submit" value="Submit">
				</form>
				<br><br><hr>
				<h3>
				<%
					String name = "Good Morning";
					out.println(name);
					
				%>
				</h3>
				</div>
				<%
				out.println("Your IP Address: "+request.getRemoteAddr());
				%>
		<hr><br>
		<%@ include file="intial.jsp" %>
		<%= "Data From Initial JSPage" +dataVar %>
		
		<br><br>
		<form name="myForm2" action="/WildFlyWorks/action.jsp" onsubmit="" method="post">
			<input type="submit" value="Action">
		</form>
		
		<a href="/WildFlyWorks/action.jsp">Action</a>
		</center>	
		<for:forEach var="i" begin="1" end ="10">
			<for:out value="${i}"/>&nbsp;
		</for:forEach>
		<br>		<br>
		
		<form action="Addition" method="POST">
			1. <input type="text" id="no1" name="no1" value="0">
			2. <input type="text" id="no2" name="no2" value="0">
			<input type="submit" value="Submit">
		</form>
  		
		<h2>Product Cart</h2>
		<form id="productForm" method="POST" action="addToCart"> 
  			<input type="text" placeholder="Enter Quantity" name="quantity" />
    		<input type="text"  placeholder="Enter Product Name"  name="productName" />    
    		<input type="text" placeholder="Enter Price"   name="price" />    
    		<input type="submit" value="Add to Cart"/>
    	</form>
    	<form id="productForm" method="POST" action="CartTotal">
    		<input type="submit" value="CheckOut"/>
    	</form>

	</body>
</html>