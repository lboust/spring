<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="${pageContext.request.contextPath}/resources/css/main.css" rel="stylesheet" >
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Devine un nombre</title>
</head>
<body>
<form method="POST">

	Coups restants : 
	${data["countDown"]}
	<br/>
	Entre un nombre entre 1 et 100 :
	<input name="currentNumber" value='${data["currentNumber"]}'/>

	<button type="submit">Guess</button>
	<br/>
	<a class="message">${data["outputMessage"]}</a>
	
</form>
</body>
</html>