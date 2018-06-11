<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="${pageContext.request.contextPath}/resources/css/main.css" rel="stylesheet" >
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Liste de formations</title>
</head>
<body>
<form method="POST" action="exo9/list">
        <table>
            <thead>
                    <tr>
                        <th>id & label</th>

                    </tr>
            </thead>
            <tbody>
            <c:forEach items="${data}" var="item">
                    <tr>
                        <td>${item}</td>     
                    </tr>   
			</c:forEach> 
          
			</tbody>        

       </table>
	
</form>
</body>
</html>