 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<table>
	
		<c:forEach items="${flights}" var="flight">
			<tr>
			
				<td>${flight.flightNumber}</td>
				<td>${flight.operatingAirlines}</td>
				<td>${flight.departureCity}</td>
				<td>${flight.arrivalCity}</td>
				<td>${flight.dateOfDeparture}</td>
				<td>${flight.estimatedDepartureTime}</td>
				<td><a href="${pageContext.request.contextPath}/flight/showConfirmPage?fid=${flight.id}">book</a></td>
			
			</tr>
		
		</c:forEach>
	
	
	</table>

