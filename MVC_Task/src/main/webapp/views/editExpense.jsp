<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Update Expense</title>

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
<body class="bg-light vh-100">
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Expense Tracker</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="/addExpense">Add Expense List</a></li>
					<li class="nav-item"><a class="nav-link" href="/expenseList">View
							Expense List</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="d-flex justify-content-center align-items-center">

		<div class="card shadow-lg p-4 bg-white rounded" style="width: 450px;">
			<h2 class="text-center text-primary fw-bold">
				<i class="bi bi-pencil-square"></i> Update Expense
			</h2>

			<form name="frm" action="/updateExpense" method="POST" class="mt-3">
				<input type="hidden" name="id" value="${e.id}" />

				<div class="mb-3">
					<label for="expenseName" class="form-label fw-semibold">Expense
						Name:</label> <input type="text" id="expenseName" name="expenseName"
						value="${e.expenseName}" class="form-control" required>
				</div>

				<div class="mb-3">
					<label for="amount" class="form-label fw-semibold">Amount:</label>
					<input type="number" id="amount" name="amount" value="${e.amount}"
						class="form-control" required>
				</div>

				<div class="mb-3">
					<label for="date" class="form-label fw-semibold">Date:</label> <input
						type="date" id="date" name="date" value="${e.date}"
						class="form-control" required>
				</div>

				<div class="mb-3">
					<label for="description" class="form-label fw-semibold">Description:</label>
					<input type="text" id="description" name="description"
						value="${e.description}" class="form-control" required>
				</div>

				<button type="submit" class="btn btn-success w-100">
					<i class="bi bi-check-lg"></i>Update Expense
				</button>
			</form>
		</div>
	</div>
</body>
</html>
