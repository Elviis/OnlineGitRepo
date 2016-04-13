<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.2/jquery.min.js"></script>
<c:url value="/scripts/script.js" var="scriptUrl" />
<script src="${scriptUrl}"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<c:url value="/getStudent/" var="JSONUrl" />
	<div >
	<c:forEach var ="student" items="${student}">
		<h3>
			<a href="#" id="a${student.id}"
				onclick="getStudent('${JSONUrl}', ${student.id})">${student.name}</a>
			<div id="student${student.id}"></div>
		</h3>
		</c:forEach>
		
	</div>
	<c:url value="/" var="addUrl"/>
	
	<a href="${addUrl}">Add a Student</a>
	
	</body>
</html>