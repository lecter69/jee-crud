<%@page import="com.example.somewebapp.service.PersonManager"%>
<%@page import="com.example.somewebapp.service.PersonManagerInMermory"%>
<%@page import="com.example.somewebapp.domain.Person"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edytuj osobę</title>
</head>
<body>

<h1>Edytuj osobę</h1>
<hr/>
<%
	PersonManager pm = (PersonManager) application.getAttribute("personManager");
	Person p = pm.getPerson(Integer.parseInt(request.getParameter("id")));
%>
<br/>
<i><%=p.toString() %></i>


<br/><br/>


        <form action="edit" method="post">
          
        
	<table>
          <tr>	
		<td>Imię:</td>
		<td><input type="text" name="name" value="<%=p.getName() %>" /></td>
	  </tr>
	  <tr>
		<td>Rok:</td>
          	<td>  <input type="text" name="yob" value="<%=p.getYob() %>" /></td>
	  </tr>
	</table>

          <input type="hidden" value="<%=request.getParameter("id") %>" name="id"/><br/>
          <input type="submit" value="Aktualizuj" />
        </form>

	<br/>
<hr/>
	<a href="all.jsp">Wszystkie osoby</a>
</body>
</html>