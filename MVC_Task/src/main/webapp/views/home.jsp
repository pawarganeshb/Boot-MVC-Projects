<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Home</title>
<link rel="icon"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.svg"
	type="image/svg+xml">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons/font/bootstrap-icons.css">
</head>
<body
	class="bg-light d-flex justify-content-center align-items-center vh-100">
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid">
			<a class="navbar-brand" href="/home">Expense Tracker</a>
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
					<li class="nav-item"><a class="nav-link" href="/editExpense">View
							Expense List</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div>
		<div class="table-responsive">
			<table
				class="table table-hover table-bordered text-center align-middle mt-4">
				<thead class="table-primary">
					<tr>
						<th>ID</th>
						<th>Expense Name</th>
						<th>Amount</th>
						<th>Date</th>
						<th>Description</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${expenses}" var="expense" varStatus="status">
						<tr>
							<td>${status.index + 1}</td>
							<td>${expense.expenseName}</td>
							<td><i class="bi bi-currency-rupee"></i> ${expense.amount}</td>
							<td><fmt:formatDate value="${expense.date}"
									pattern="dd-MM-yyyy" /></td>
							<td>${expense.description}</td>
							<td><a href="editExpense/${expense.id}"
								class="btn btn-sm btn-warning text-white"> <i
									class="bi bi-pencil-square"></i> Edit
							</a> <a href="/deleteExpense/${expense.id}"
								class="btn btn-sm btn-danger"
								onclick="return confirm('Are you sure you want to delete this expense?')">
									<i class="bi bi-trash3"></i> Delete
							</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>


	</div>
</body>
</html>