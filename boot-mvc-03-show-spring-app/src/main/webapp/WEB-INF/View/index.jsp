<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
* {
	margin: 0px;
	padding: 0px;
}

nav {
	background-color: gray;
	display: flex;
	justify-content: center;
}

a {
	font-size: 1.5rem;
	padding: 12px;
	margin: 12px;
	padding: 12px;
	font-size: 1.5rem;
	cursor: pointer;
	color: white;
	font-family: sans-serif;
}

section {
	margin-top: 12px;
}
</style>
</head>
<body>
	<nav>
		<a>Home</a> <a>About</a> <a>Services</a> <a>Contact</a>
	</nav>
	<section>
		<h1>Data is: ${Name}</h1>
		<h1>Data is: ${Date}</h1>
	</section>
</body>
</html>