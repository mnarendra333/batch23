<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="java.util.List,java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
	
	
	
	<c:set var="x" value="10"></c:set>
	<c:set var="y" value="20"></c:set>
	<c:if test="${x < y}">
	
		<c:out value="y is big"></c:out>
	</c:if>
	
	
	<%
	
		ArrayList<String> fruitsList = new ArrayList<String>();
		fruitsList.add("apple");
		fruitsList.add("orange");
		fruitsList.add("grape");
		fruitsList.add("banana");
		
		request.setAttribute("data", fruitsList);
	%>
	
	<c:forEach items="${data}" var="str"> 
		<c:out value="${str}"/>
	
	</c:forEach>
	
	
	
	<c:set var="ch" value="g"/>
	<c:choose>
		<c:when test="${ch == 'a'}">
			<c:out value="${ch} is a vowel"/>
		</c:when>
		<c:when test="${ch == 'e'}">
			<c:out value="${ch} is a vowel"/>
		</c:when>
		<c:when test="${ch == 'i'}">
			<c:out value="${ch} is a vowel"/>
		</c:when>
		<c:when test="${ch == 'o'}">
			<c:out value="${ch} is a vowel"/>
		</c:when>
		<c:when test="${ch == 'u'}">
			<c:out value="${ch} is a vowel"/>
		</c:when>
		<c:otherwise>
			<c:out value="${ch} is a consonent"/>
		</c:otherwise>
	
	
	</c:choose>
	
	
	
	<c:forTokens items="Today is not a holiday" delims=" " var="str">
	
		<c:out value="${str}"></c:out>
	</c:forTokens>
	

</body>
</html>