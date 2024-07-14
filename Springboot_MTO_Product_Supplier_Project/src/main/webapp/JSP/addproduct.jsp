<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>
<form action="saveproduct">
		<pre>
		Product Name: <input type="text" name="pname">
		
		Product Price:<input type="text" name="pprice">
		
		Select supplier: <select name="s">
							 <option>---SELECT---</option>
							 <c:forEach items="${data}" var="l">
              					  <option value="${l.sid}">${l.sname}</option>
          					  </c:forEach>
							
						</select>
		
		<input type="submit" value="SAVE">
			
		
		<a href="home">HOME</a>	
		</pre>
	</form>


</body>
</html>