<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Airlines Information</h2>
	<c:out value="${flighObj.id}"></c:out>
	<pre>
	flightNumber : <c:out value="${flighObj.flightNumber}"></c:out>
	
	Airlines : <c:out value="${flighObj.operatingAirlines}"></c:out>
	
	DepartureCity : <c:out value="${flighObj.departureCity}"></c:out>
	
	ArrivalCity : <c:out value="${flighObj.arrivalCity}"></c:out>
	
	DateOfDeparture : <c:out value="${flighObj.dateOfDeparture}"></c:out>
	
	EstimatedDepartureTime : <c:out value="${flighObj.estimatedDepartureTime}"></c:out>
	</pre>


	<div>
		
		<h2>Passenger Information</h2>
		
		<form:form action="${pageContext.request.contextPath}/reservation/bookTicket" method="post" modelAttribute="reservationRequest">
		<form:hidden  path="fid" value="${flighObj.id}"/>
		<pre>
		First Name : <form:input  path="firstName"/>

		Last Name : <form:input  path="lastName"/>
		
		middleName : <form:input  path="middleName"/>
		
		email : <form:input  path="email" required="required"/>
		
		mobileNo : <form:input  path="mobileNo"/>
		
		
		
		<h2>Payment Details</h2>
		Card No : <form:input  path="cardNo"/>
		
		Expiry Date : <form:input  path="expDate"/>
		
		CVV : <form:input  path="cvv"/>
		
		Name of the CardHolder : <form:input  path="name"/>
		<input type="submit" value="book ticket"/>
		</pre>
	</form:form>
	
	</div>
</body>
</html>