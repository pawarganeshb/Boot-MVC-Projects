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
<title>Update Customer</title>
<style>
.form-container {
	min-width: 500px;
	margin: auto;
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
		<h2 class="text-center mb-4 text-info">Update Customer Details</h2>
		<form modelAttribute="cust" method="post">
			<div class="mb-3">
				<label for="cno" class="form-label">Customer Number</label> <input
					type="text" class="form-control" id="cno" name="cno"
					value="${cust.cno}" readonly required>
			</div>
			<div class="mb-3">
				<label for="name" class="form-label">Name</label> <input type="text"
					class="form-control" id="name" name="name" value="${cust.name}"
					required>
			</div>
			<div class="mb-3">
				<label for="cam" class="form-label">Amount</label> <input
					type="number" class="form-control" id="camt" name="camt"
					value="${cust.camt}" required>
			</div>
			<div class="mb-3">
				<label for="products" class="form-label">Select Product</label> <select
					class="form-control" id="products" name="products" required>
					<option value="">--Select a Product--</option>
					<option value="Laptop"
						${cust.products == 'Laptop' ? 'selected' : ''}>Laptop</option>
					<option value="Tablet"
						${cust.products == 'Tablet' ? 'selected' : ''}>Tablet</option>
					<option value="Smartphone"
						${cust.products == 'Smartphone' ? 'selected' : ''}>Smartphone</option>
					<option value="Headphones"
						${cust.products == 'Headphones' ? 'selected' : ''}>Headphones</option>
					<option value="Smartwatch"
						${cust.products == 'Smartwatch' ? 'selected' : ''}>Smartwatch</option>
					<option value="Camera"
						${cust.products == 'Camera' ? 'selected' : ''}>Camera</option>
					<option value="Speakers"
						${cust.products == 'Speakers' ? 'selected' : ''}>Speakers</option>
					<option value="Router"
						${cust.products == 'Router' ? 'selected' : ''}>Router</option>
					<option value="Mouse" ${cust.products == 'Mouse' ? 'selected' : ''}>Mouse</option>
					<option value="Monitor"
						${cust.products == 'Monitor' ? 'selected' : ''}>Monitor</option>
				</select>
			</div>
			<input class="btn btn-primary" type="submit"
				onclick="alert('Updating the record')" value="Update Record">
			<input class="btn btn-danger" type="reset" value="Cancel">
		</form>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
