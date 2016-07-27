<%@ page import="java.net.InetAddress"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.javaone.jpa.Data" %>
<%@ page import="java.util.List" %>

<%
List<Data> dataList = (List<Data>)request.getAttribute("dataList");
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Docker DB Demo</title>
</head>
<body>
<center>
	<h1>The Host is</h1>
	<h1><font color="red"><%=InetAddress.getLocalHost().getHostAddress()%></font></h1>
	<form action="DataServlet">
		<input type="submit" value="Create Data and Show It!!!">
	</form>
	
	<%if (dataList != null && !dataList.isEmpty()) {%>
		<%for(Data data: dataList) {%>
			<p><%= data.print() %></p>
		<%}%>
	<%} %>
</center>
</body>
</html>