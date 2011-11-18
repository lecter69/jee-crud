<%@page import="com.example.somewebapp.service.PersonManager"%>
<%@page import="com.example.somewebapp.service.PersonManagerInMermory"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Wszystkie osoby</title>
</head>
<body>	
	<h1>Wszystkie osoby</h1>
		<hr/><br/>
	<%
	PersonManager lista = new PersonManagerInMermory();
	
	List list = lista.getAllPersons();
	pageContext.setAttribute("lista", list);
	
	int i =0;
	%>

	<table>
	<c:forEach var="l" items="${lista}">
	<tr>
		<td>${l.name}</td><td>${l.yob} </td>
		<td> &nbsp;&nbsp; <a href="edit.jsp?id=<%=i%>">Edytuj</a> | </td>
		<td><a href="delete.jsp?id=<%=i%>">Usuń</a></td>
		
	</tr>
	<% i++; %>
		</c:forEach>
		</table>
<br/>
	<hr/>
	
	<a href="add.jsp">Dodaj nową osobę</a>
	
	
	
</body>
</html>
