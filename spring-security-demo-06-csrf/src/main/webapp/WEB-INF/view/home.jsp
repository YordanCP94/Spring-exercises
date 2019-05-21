<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Home Page</title>
</head>
<body>
	<h2>Welcome Page</h2>
	<hr>
	Welcome to the Spring example
	
	<form:form action="${pageContext.request.contextPath}/logout" method="POST">
		<input type="submit" value="Logout"/>
	</form:form>
</body>
</html>