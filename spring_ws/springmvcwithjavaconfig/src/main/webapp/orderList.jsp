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

<a href=${pageContext.request.contextPath}/order/displayform>AddOrder</a>
<div>
	${msg}
</div>
<table width="100%">

	<c:forEach var="order" items="${list}">
		<tr>
		<td>${order.orderId}</td>
		<td>${order.foodItem}</td>
		<td>${order.price}</td>
		<td>${order.qty}</td>
		<td>${order.restnt}</td>
		<td>${order.discount}</td>
		<td><a href=${pageContext.request.contextPath}/order/delete?id=${product.proId}>delete</a></td>
		<td><a href=${pageContext.request.contextPath}/order/displayedit?id=${product.proId}>edit</a></td>
		
		</tr>
	
	</c:forEach>
</table>
</body>
</html>	