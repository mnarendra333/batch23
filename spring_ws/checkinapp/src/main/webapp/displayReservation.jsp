<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<pre>
<c:out value="${resData.flight.flightNumber}"></c:out>
<c:out value="${resData.flight.departureCity}"></c:out>
<c:out value="${resData.flight.arrivalCity}"></c:out>
<c:out value="${resData.flight.dateOfDeparture}"></c:out>
<c:out value="${resData.flight.estimatedDepartureTime}"></c:out>


<c:out value="${resData.passenger.firstName}"></c:out>
<c:out value="${resData.passenger.lastName}"></c:out>
<c:out value="${resData.passenger.middleName}"></c:out>
<c:out value="${resData.passenger.email}"></c:out>
<c:out value="${resData.passenger.mobileNo}"></c:out>
</pre>

<form action="checkin">
	<h2>Check In Deatils</h2>
	No Of Bags : <input type="text" name="noOfBags" />
	
	<input type="hidden" name="id" value="${resData.id}">
	 <input type="submit"
		value="checkin" />
</form>