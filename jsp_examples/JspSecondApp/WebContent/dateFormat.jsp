<%@page import="java.text.SimpleDateFormat,java.util.Date"%>
<%@page import="java.util.Date" %>

<%

	
	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy");
	String todaysDate = sdf.format(date);


%>
<%=date%>
<%=todaysDate%>