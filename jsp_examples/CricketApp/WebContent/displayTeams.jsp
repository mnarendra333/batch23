<%@page import="java.util.List,com.pragim.cricketapp.model.TeamInfo" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="css/bootstrap.min.css">
  <script src="js/jquery.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  
  <script type="text/javascript">
  
  	setTimeout(function(){
	  $('#mydiv').remove();
	}, 5000);
  
  </script>
</head>
<body>

<!-- <form action="teamssrv">

	<input type="submit" value="GetTeams"/>
</form> -->


<!-- or -->
<form class="form-horizontal" action="teamssrv" method="post">
<%
TeamInfo obj = (TeamInfo)request.getAttribute("teamObj");
if(obj!=null && obj.getTeamId()!=0){
%>

	<input type="hidden" name="teamId" value=<%=obj.getTeamId()%>>
  <div class="form-group">
    <label class="control-label col-sm-2" for="teamName">Team Name:</label>
    <div class="col-sm-6">
      <input type="text" class="form-control" id="teamName" name="teamName" placeholder="Enter Team Name" value=<%=obj.getTeamName() %>>
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="pwd">City:</label>
    <div class="col-sm-6">
      <input type="text" class="form-control" id="city" name="city" value="<%=obj.getCity()%>">
      	
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="captain">Captain:</label>
    <div class="col-sm-6">
      <input type="text" class="form-control" id="captain" name="captain" placeholder="Enter captain Name" value="<%=obj.getCaptain()%>">
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="captain">Ambassader</label>
    <div class="col-sm-6">
      <input type="text" class="form-control" id="ambassader" name="ambassader" placeholder="Enter Ambassader Name" value="<%=obj.getAmbassader()%>">
    </div>
  </div>
  
  
  <%}else{ %>
  
  <div class="form-group">
    <label class="control-label col-sm-2" for="teamName">Team Name:</label>
    <div class="col-sm-6">
      <input type="text" class="form-control" id="teamName" name="teamName" placeholder="Enter Team Name">
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="pwd">City:</label>
    <div class="col-sm-6">
      <select class="form-control" id="city" name="city">
      	<option>--select--</option>	
      	<option>bangl</option>
      	<option>panjab</option>
      	<option>kolkatta</option>
      	<option>mumbai</option>
      	<option>pune</option>
      	<option>rajastan</option>
      	<option>delhi</option>
      	<option>chenni</option>
      </select>
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="captain">Captain:</label>
    <div class="col-sm-6">
      <input type="text" class="form-control" id="captain" name="captain" placeholder="Enter captain Name">
    </div>
  </div>
  
   <div class="form-group">
    <label class="control-label col-sm-2" for="captain">Ambassader</label>
    <div class="col-sm-6">
      <input type="text" class="form-control" id="ambassader" name="ambassader" placeholder="Enter Ambassader Name" >
    </div>
  </div>
  
  
 
 <%
  }
 	if(obj!=null && obj.getTeamId()!=0){
 %>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default" name="btnName" value="update">Update Team</button>
    </div>
  </div>
  <%}else{ %>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default" name="btnName" value="add">Add Team</button>
    </div>
  </div>
  
  <%} %>
</form>

<br>
<br>
<br>
<%
	String msg = (String)request.getAttribute("msg");
	if(msg!=null){
%>

	
	<span id="mydiv" style="text-align: center;background: green;font-size: medium;"><%=msg%></span>
	<%} %>
<a href="teamssrv" class="btn btn-primary">Add Team</a>
<h2>Teams Info</h2>

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
				<td><input type="checkbox" value=<%= info.getTeamId()%>/></td>
				<td><%= info.getTeamId()%></td>
				<td><%= info.getTeamName()%></td>
				<td><%= info.getCity()%></td>
				<td><%= info.getCaptain()%></td>
				<td><%= info.getAmbassader()%></td>
				<td><a href="teamssrv?btnName=edit&id=<%= info.getTeamId()%>" class="btn btn-primary">edit</a></td>
				<td><a href="teamssrv?btnName=delete&id=<%= info.getTeamId()%>" class="btn btn-danger">delete</a></td>
			</tr>
		<%} %>
</table>

</body>
</html>