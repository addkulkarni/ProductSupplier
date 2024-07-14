<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
<script>
	
</script>
</head>
<body>
<form action="updateproduct" name="fn">
		<pre>
		<input type="hidden" name="pid" value="${pro.pid}">
		
		Product Name: <input type="text" name="pname" value="${pro.pname}">
		
		Product Price:<input type="text" name="pprice" value="${pro.pprice}">
		
		Select supplier: <select name="s">
							 <c:forEach items="${data}" var="l">
              					  <option value="${l.sid}" <c:if test="${l.sid==selectedid}">selected</c:if>>${l.sname}</option>
          					  </c:forEach>
						</select>
		
		<input type="submit" value="UPDATE">
			
		
		<a href="home">HOME</a>	
		</pre>
	</form>


</body>
</html>