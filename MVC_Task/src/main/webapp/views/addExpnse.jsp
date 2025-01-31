<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Add Expense</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

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
						aria-current="page" href="/addExpnse">Add Expense List</a></li>
					<li class="nav-item"><a class="nav-link" href="/expenseList">View
							Expense List</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="d-flex justify-content-center align-item-center">

		<div
			class="card shadow-lg p-4 d-flex justify-content-center align-items-center bg-white rounded"
			style="width: 400px;">
			<h2 class="text-center text-primary fw-bold">
				<i class="bi bi-wallet2"></i> Add New Expense
			</h2>

			<c:if test="${not empty message}">
				<p class="alert alert-success text-center mt-3">${message}</p>
			</c:if>
			<c:if test="${not empty errorMessage}">
				<p class="alert alert-danger text-center mt-3">${errorMessage}</p>
			</c:if>

			<form action="/addExpnse" method="post" class="mt-3">
				<div class="mb-3">
					<input type="text" name="expenseName" class="form-control"
						placeholder="Expense Name" required>
				</div>
				<div class="mb-3">
					<input type="number" name="amount" class="form-control"
						placeholder="Amount" required>
				</div>
				<div class="mb-3">
					<input type="date" name="date" class="form-control" required>
				</div>
				<div class="mb-3">
					<input type="text" name="description" class="form-control"
						placeholder="Description" required>
				</div>
				

				<button type="submit" class="btn btn-primary w-100">
					<i class="bi bi-plus-lg"></i> Add Expense
				</button>

				<button type="button" onclick="window.location.href='/expenseList'"
					class="btn btn-outline-secondary w-100 mt-3">
					<i class="bi bi-card-list"></i> Show All Expenses
				</button>
			</form>
		</div>
	</div>
</body>
</html>
