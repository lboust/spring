<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="${pageContext.request.contextPath}/resources/css/main.css" rel="stylesheet" >
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Creation de formation</title>
</head>
<body>
<form method="POST" action="creation">

<div class=form>
	Nom de la formation :
	<input name="label" />
	<button type="submit">OK</button>
</div>
	
</form>
</body>
</html>