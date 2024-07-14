<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
<pre>
	<table border="2">
		
			<tr>
				<th>SUPPLIER ID</th>
				<th>SUPPLIER NAME</th>
				<th>SUPPLIER CONTACT</th>
				<th>ACTION</th>
			</tr>
			
			<c:forEach items="${data}" var="l">
				<tr>
					<td>${l.sid}</td>
					<td>${l.sname}</td>
					<td>${l.scontact}</td>
					<td><a href="editsupplier?sid=${l.sid}">EDIT</a> || <a href="deletesupplier?sid=${l.sid}">DELETE</a></td>
				</tr>	
			</c:forEach>		
	</table>
	
	                 <a href="paging?pageno=0">1</a> || <a href="paging?pageno=1">2</a> || <a href="paging?pageno=2">3</a>
	<br><br>
	</pre>	
</form>

<a href="home">HOME</a>
</body>
</html>