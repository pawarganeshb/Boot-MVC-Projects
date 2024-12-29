<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome To Registration</h1>

	<f:form modelAttribute="emp">
		<label for="fName">First Name</label>
		<f:input path="fName" placeholder="First Name" id="fName" />

		<label for="lName">Last Name</label>
		<f:input path="lName" placeholder="Last Name" id="lName" />

		<input type="submit" value="Register" />
	</f:form>
</body>
</html>