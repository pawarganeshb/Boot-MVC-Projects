<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tracker Dashboard</title>

<!-- Bootstrap 5 CDN -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

<!-- Bootstrap Icons -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons/font/bootstrap-icons.css">
</head>
<body class="d-flex justify-content-center align-items-center vh-100">
	<nav></nav>
	<div class="card shadow-lg p-4 text-center bg-white rounded"
		style="width: 380px;">
		<h2 class="text-primary fw-bold">
			<i class="bi bi-wallet2"></i>Expense Tracker
		</h2>
		<button class="btn btn-primary w-100 my-2"
			onclick="window.location.href='/addExpnse'">
			<i class="bi bi-plus-lg"></i> Add Expense
		</button>

		<button class="btn btn-secondary w-100 my-2"
			onclick="window.location.href='/expenseList'">
			<i class="bi bi-list-ul"></i> Show All Expenses
		</button>
	</div>

</body>
</html>
