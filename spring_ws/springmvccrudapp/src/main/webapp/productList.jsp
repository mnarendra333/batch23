<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href=${pageContext.request.contextPath}/product/displayform>AddProduct</a>
<div>
	${msg}
</div>
<table width="100%">

	<c:forEach  var="product" items="${list}">
		<tr>
		<td>${product.proId}</td>
		<td>${product.proName}</td>
		<td>${product.price}</td>
		<td>${product.proDesc}</td>
		<td><a href="product/delete?id=${product.proId}">delete</a></td>
		
		</tr>
	
	</c:forEach>
</table>
</body>
</html>	