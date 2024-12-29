<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Info</title>
<style type="text/css">
strong {
	margin: 12px;
	padding: 12px;
}

.box {
	display: flex;
	justify-content: center;
	align-items: center;
}

a {
	text-decoration: none;
	border: 2px solid black;
	margin: 9px;
	padding: 9px;
	border-radius: 9px;
}
</style>
</head>
<body>
	<strong>Student Info: ${stu}</strong>
	<div class="box">
		<a href="/">Home</a> <a href="/register">Register</a>
	</div>
</body>
</html>