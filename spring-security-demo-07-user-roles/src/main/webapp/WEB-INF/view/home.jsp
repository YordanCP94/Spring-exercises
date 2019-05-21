<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<title>Home Page</title>
</head>
<body>
	<h2>Welcome Page</h2>
	<hr>
	Welcome to the Spring example
	
	<hr>
	
	<!-- display username and role -->
	<p>
		User: <security:authentication property="principal.username"/>
	</p>
	<p>		
		Role(s): <security:authentication property="principal.authorities"/>
	</p>
	
	<hr>
	
	<!-- Add a link to point to /leaders ... this is for the managers -->
	
	<p>
		<a href="${pageContext.request.contextPath}/leaders">Leadership Meeting (Only for manager peeps)</a>
	</p>
	
	<hr>
	
	<form:form action="${pageContext.request.contextPath}/logout" method="POST">
		<input type="submit" value="Logout"/>
	</form:form>
</body>
</html>