<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<%
	String message = (String)request.getAttribute("msg");
%>

<%if(message!=null) {%>
<h2><%=message %></h2>

<%} %>
<body>

	<form action="loginsrv">
		
		<table>
		
			<tr>
				<td>Username</td>
				<td><input type="text" name="uname"/></td>
			
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="pwd"/></td>
			
			</tr>
			<tr>
				<td><input type="submit" value="login"/></td>
			
			</tr>
		
		</table>
	
	
	</form>

</body>
</html>