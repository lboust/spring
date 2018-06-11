<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="${pageContext.request.contextPath}/resources/css/main.css" rel="stylesheet" >
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulaire des formations</title>
</head>
<body>
<form method="POST" action="exo9/creation">
<div class=form>
	<button type="submit" class="button" name="action" value="creation" >Créer</button> </br>
</div>
</form>

<form method="POST" action="exo9/list">
<div class=form>
	<button type="submit" class="button" name="action">Consulter</button>
</div>
</form>
</body>
</html>