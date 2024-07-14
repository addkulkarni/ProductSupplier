<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script>
	function deletemultiple()
	{
		document.fn.action="deletemultiple";
		document.fn.submit();
	}
</script>
<title>View Product</title>
</head>
<body>
<form name="fn">
	<table border="2" name="tb">
		<pre>
			<tr>
				<th>PRODUCT ID</th>
				<th>PRODUCT NAME</th>
				<th>PRODUCT PRICE</th>
				<th>PRODUCT SUPPLIER</th>
				<th>ACTION</th>
			</tr>
			
			<c:forEach items="${data}" var="l">
				<tr>
					<td>${l.pid}</td>
					<td>${l.pname}</td>
					<td>${l.pprice}</td>
					<td>${l.s.sname}</td>
					<td><a href="editproduct?pid=${l.pid}">EDIT</a> || <a href="deleteproduct?pid=${l.pid}">DELETE</a></td>	
				</tr>
			</c:forEach>

			
		</pre>
	</table>
	<br><br>
	
	</form>
<a href="home">HOME</a>
</body>
</html>