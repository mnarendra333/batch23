<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form:form action="add" modelAttribute="product">
	
		ProductName : <form:input path="proName"/><br>
		Price : <form:input path="price"/><br>
		Desc : <form:input path="proDesc"/><br>
	
		<input type="submit" value="addproduct"/>
	
	</form:form>

</body>
</html>