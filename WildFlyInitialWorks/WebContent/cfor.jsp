<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "for" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Rohith Vutnoor</title>
</head>
<body>
<for:forEach var="i" begin="1" end ="10">
Item <for:out value="${i }"/>
</for:forEach>
</body>
</html>