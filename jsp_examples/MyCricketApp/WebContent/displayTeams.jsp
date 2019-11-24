<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List,com.pragim.mycricketapp.model.TeamInfo" %>
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

<%
	TeamInfo obj = (TeamInfo)request.getAttribute("teamObject");
	%>

<div class="container">
  <h2>Horizontal form</h2>
  <form class="form-horizontal" action="teamssrv">
   
  <% if(obj!=null){
	%>
	<input type="hidden" name="id" value=<%=obj.getTeamId() %>> 
    <div class="form-group">
      <label class="control-label col-sm-2" for="TeamName">TeamName:</label>
      <div class="col-sm-4">
        <input type="text" class="form-control" id="teamName" placeholder="Enter TeamName" name="teamName" value=<%=obj.getTeamName() %>>
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="city">City:</label>
      <div class="col-sm-4">          
        <input type="text" class="form-control" id="city" placeholder="Enter City" name="city" value=<%=obj.getCity() %>> 
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="captain">Captain:</label>
      <div class="col-sm-4">          
        <input type="text" class="form-control" id="captain" placeholder="Enter captain" name="captain" value=<%=obj.getCaptain()%>>
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="ambassadar">Ambassadar:</label>
      <div class="col-sm-4">          
        <input type="text" class="form-control" id="ambassadar" placeholder="Ambassadar" name="ambassadar" value=<%=obj.getAmbassadar()%>>
      </div>
    </div>
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-6">
        <button type="submit" class="btn btn-default" name="btnName" value="update">Update Team</button>
      </div>
    </div>
    
    <%}else{ %>
    <div class="form-group">
      <label class="control-label col-sm-2" for="TeamName">TeamName:</label>
      <div class="col-sm-4">
        <input type="text" class="form-control" id="teamName" placeholder="Enter TeamName" name="teamName">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="city">City:</label>
      <div class="col-sm-4">          
        <input type="text" class="form-control" id="city" placeholder="Enter City" name="city">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="captain">Captain:</label>
      <div class="col-sm-4">          
        <input type="text" class="form-control" id="captain" placeholder="Enter captain" name="captain">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="ambassadar">Ambassadar:</label>
      <div class="col-sm-4">          
        <input type="text" class="form-control" id="ambassadar" placeholder="Ambassadar" name="ambassadar">
      </div>
    </div>
    
     <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-6">
        <button type="submit" class="btn btn-default" name="btnName" value="add">Add Team</button>
      </div>
    </div>
    
    <%} %>
  </form>
</div>

<br><br>

<%

	String message = (String)request.getAttribute("msg");
if(message!=null){
%>
<h2><%=message%></h2>
<%} %>
<table class="table table-hover" style="width: 50%">
<%

List<TeamInfo> list = (List<TeamInfo>)request.getAttribute("myteams");

	if(list!=null){
		for(TeamInfo teamInfo:list){
%>
	<tr>
		<td><%=teamInfo.getTeamId() %></td>
		<td><%=teamInfo.getTeamName() %></td>
		<td><%=teamInfo.getCity()%></td>
		<td><%=teamInfo.getCaptain()%></td>
		<td><%=teamInfo.getAmbassadar() %></td>
		<td><a href="teamssrv?id=<%=teamInfo.getTeamId() %>&btnName=delete" class="btn btn-primary">delete</a></td>
		<td><a href="teamssrv?id=<%=teamInfo.getTeamId() %>&btnName=edit" class="btn btn-primary">edit</a></td>
	</tr>
	
	<%}} %>
</table>
</body>
</html>