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
<title>Usuń osobę</title>
</head>
<body>

<h1>Usuń osobę</h1>
<hr/>
<%
	PersonManager pm = (PersonManager) application.getAttribute("personManager");
	Person p = pm.getPerson(Integer.parseInt(request.getParameter("id")));
%>
<br/>
<i><%=p.toString() %></i>
<br/><br/>
Czy jesteś pewien?


<table>
        <form action="delete" method="post">
             
          <input type="hidden" value="<%=request.getParameter("id") %>" name="id"/><br/>
          <input type="submit" value="TAK" />

        </form>

	 <form action="all.jsp">
                    
          <input type="submit" value="NIE" />

        </form>
</table>

	<br/>
<hr/>
	<a href="all.jsp">Wszystkie osoby</a>
</body>
</html>