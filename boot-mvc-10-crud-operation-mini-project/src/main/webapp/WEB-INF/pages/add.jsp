<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<title>Add Customer</title>
<style>
.form-container {
	min-width: 500px; /* Set the max-width for the form */
	margin: auto; /* Center horizontally */
	padding: 20px;
	background-color: #f8f9fa;
	border-radius: 8px;
	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
	flex-direction: column;
}

body, html {
	height: 100%;
	display: flex;
	justify-content: center;
	align-items: center;
	background-color: #e9ecef;
}

h1, h2 {
	font-family: 'Arial', sans-serif;
}

a {
	text-decoration: none;
}
</style>
</head>
<body>

	<div class="form-container">
		<h2 class="text-center mb-4">Enter Customer Details</h2>
		<form modelAttribute="cust" method="post">
			<div class="mb-3">
				<label for="cno" class="form-label">Customer Number</label> <input
					type="text" class="form-control" id="cno" name="cno" required>
			</div>
			<div class="mb-3">
				<label for="name" class="form-label">Name</label> <input type="text"
					class="form-control" id="name" name="name" required>
			</div>
			<div class="mb-3">
				<label for="cam" class="form-label">Amount</label> <input
					type="number" class="form-control" id="camt" name="camt" required>
			</div>
			<div class="mb-3">
				<label for="products" class="form-label">Select Product</label> <select
					class="form-control" id="products" name="products" required>
					<option value="">--Select a Product--</option>
					<option value="Laptop">Laptop</option>
					<option value="Tablet">Tablet</option>
					<option value="Smartphone">Smartphone</option>
					<option value="Headphones">Headphones</option>
					<option value="Smartwatch">Smartwatch</option>
					<option value="Camera">Camera</option>
					<option value="Speakers">Speakers</option>
					<option value="Router">Router</option>
					<option value="Mouse">Mouse</option>
					<option value="Monitor">Monitor</option>
				</select>
			</div>
			<input class="btn btn-primary" type="submit"
				onclick="alert('Record is adding!')"
				value="Add Record"> <input class="btn btn-danger"
				type="reset" value="Reset">
		</form>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
