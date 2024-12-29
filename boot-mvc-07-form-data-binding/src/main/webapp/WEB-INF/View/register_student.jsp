<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Student</title>
<style type="text/css">
.container {
	display: flex;
	justify-content: center;
	align-items: center;
	border: 2px solid black;
	margin: 12px;
	padding: 12px;
	flex-direction: column;
}

form {
	background: #ffffff;
	border-radius: 10px;
	box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
	padding: 20px 40px;
	width: 100%;
	max-width: 400px;
	margin: 12px;
	padding: 25px;
	margin-top: 12px;
}

form div {
	margin-bottom: 20px;
}

form label {
	display: block;
	font-size: 14px;
	color: #333333;
	margin-bottom: 5px;
}

form input {
	width: 100%;
	padding: 10px;
	border: 1px solid #cccccc;
	border-radius: 5px;
	font-size: 14px;
	outline: none;
	transition: border-color 0.3s;
}

form input:focus {
	border-color: #4CAF50;
}

form button {
	background-color: #4CAF50;
	color: white;
	border: none;
	padding: 10px 20px;
	border-radius: 5px;
	cursor: pointer;
	font-size: 16px;
	transition: background-color 0.3s;
}

form button:hover {
	background-color: #45a049;
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
	<div class="container">
		<div>
			<h1>Welcome To Registration</h1>
		</div>
		<div>
			<a href="/">Home</a>
		</div>
		<div>
			<form action="register" method="POST">
				<div>
					<label>Student ID</label> <input type="text"
						placeholder="enter your id" name="sId">
				</div>
				<div>
					<label>Student Name</label> <input type="text"
						placeholder="enter your name" name="sName">
				</div>
				<div>
					<label>Student Address</label> <input type="text" name="sAddress"
						placeholder="enter your address">
				</div>
				<div>
					<label>Student Average</label> <input type="text" name="avg"
						placeholder="enter your address">
				</div>
				<div>
					<input type="submit" value="Register">
				</div>
			</form>
		</div>
	</div>
</body>
</html>