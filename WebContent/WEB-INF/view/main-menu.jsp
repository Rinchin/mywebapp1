<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/my-test.css">

<script
	src="${pageContext.request.contextPath}/resources/js/simple-test.js"></script>

</head>
<body>
	<h2>Spring MVC Demo - Home Page</h2>
	<br>
	<br>

	<a href="hello/showForm">Hello world form</a>
	<br><br>
	<a href="student/showForm">Student registration form</a>

	<br>
	<img
		src="${pageContext.request.contextPath}/resources/images/spring-logo.png"
		width="155" />

	<br>
	<br>

	<input type="button" onclick="doSomeWork()" value="Click Me" />

</body>
</html>