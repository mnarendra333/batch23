<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>I am from A.jsp</h2>
	<%-- <jsp:forward page="b.jsp"></jsp:forward> --%>
	<jsp:include page="b.jsp"></jsp:include>
</body>
</html>