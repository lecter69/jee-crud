<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dodaj nową osobę</title>
    </head>
    <body>
        <h1>Dodaj nową osobę</h1>
        <hr/><br/>
        <form action="add" method="post">

	<table>
          <tr>	
		<td>Imię:</td>
		<td><input type="text" name="name" /></td>
	  </tr>
	  <tr>
		<td>Rok:</td>
          	<td><input type="text" name="yob" /></td>
	  </tr>
	</table>
	<br/>
          <input type="submit" value="Dodaj" />
        </form>

	<br/>
<hr/>
	<a href="all.jsp">Wszystkie osoby</a>

    </body>
</html>
