<%@page import="java.util.List,com.pragim.cricketapp.model.TeamInfo" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="css/bootstrap.min.css">
  <script src="js/jquery.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
</head>
<body>

<!-- <form action="teamssrv">

	<input type="submit" value="GetTeams"/>
</form> -->


<!-- or -->

<a href="teamssrv">GetTeams</a>

<br>
<br>
<br>
<a href="teamssrv" class="btn btn-primary">Add Team</a>
<h2 class="jumbotron">Teams Info</h2>

<%

	List<TeamInfo> list = (List<TeamInfo>)request.getAttribute("teamsData");
%>

<table class="table table-hover">
<tr>
	<th></th>
	<th>Id</th>
	<th>Team Name</th>
	<th>City</th>
	<th>Captain</th>
	<th>Ambassader</th>
</tr>
		<%
		if(list!=null)
		for(TeamInfo info : list){
		%>
			<tr>
				<td><input type="checkbox"/></td>
				<td><%= info.getTeamId()%></td>
				<td><%= info.getTeamName()%></td>
				<td><%= info.getCity()%></td>
				<td><%= info.getCaptain()%></td>
				<td><%= info.getAmbassader()%></td>
				<td><a href="" class="btn btn-primary">edit</a></td>
				<td><a href="" class="btn btn-danger">delete</a></td>
			</tr>
		<%} %>
</table>

</body>
</html>