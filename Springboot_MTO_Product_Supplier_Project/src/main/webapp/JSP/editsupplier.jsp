<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form action="updatesupplier">
		<pre>
		<input type="hidden" name="sid" value="${s.sid}">
		
		Supplier Name: <input type="text" name="sname" value="${s.sname}">
		
		Supplier Contact Number:<input type="tel" name="scontact" value="${s.scontact}">
	
		<input type="submit" value="UPDATE">
			<br>
			<a href="home">HOME</a>

			
		</pre>
	</form>
</body>
</html>