<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  



<form:form action="flight/searchFlights" modelAttribute="showFlightsBean">

	<table>
	
		<tr>
		
			<td>From</td><td><form:input path="from"/></td>&nbsp
			<td>To</td><td><form:input path="to"/></td>&nbsp
			<td>Date</td><td><form:input path="date"/></td>&nbsp
			<td><input type="submit" value="search"></td>
		</tr>
	</table>


</form:form>