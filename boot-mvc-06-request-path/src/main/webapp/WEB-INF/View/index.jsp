<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Model Attribute Data is</h2>
	<b> Colors: <%=Arrays.toString((String[]) request.getAttribute("favColor"))%></b>
	<br>
	<b> Name: ${nickName}</b>
	<br>
	<b> Cell: ${phonNumber}</b>
	<br>
	<b> ID's: ${idDetail}</b>

</body>
</html>