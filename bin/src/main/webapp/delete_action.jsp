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

</head>
<body>


<%
	PersonManager pm = (PersonManager) application.getAttribute("personManager");
	pm.deletePerson(Integer.parseInt(request.getParameter("id")));

	response.sendRedirect("all.jsp");
%>


</body>
</html>