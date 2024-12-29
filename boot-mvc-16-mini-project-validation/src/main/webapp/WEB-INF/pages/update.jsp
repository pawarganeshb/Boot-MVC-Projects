<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Update Employee</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container mt-5">
		<h2 class="text-center text-primary">Update Employee</h2>
		<form:form method="post" action="/update" modelAttribute="employee"
			class="mt-4">
			<div class="row mb-3">
				<label for="emp_id" class="col-sm-3 col-form-label">Employee
					ID:</label>
				<div class="col-sm-9">
					<form:input path="emp_id"  id="emp_id" class="form-control"
						readonly="true" />
				</div>
			</div>
			<div class="row mb-3">
				<label for="name" class="col-sm-3 col-form-label">Employee
					Name:</label>
				<div class="col-sm-9">
					<form:input path="name"  id="name" class="form-control" />
				</div>
			</div>
			<div class="row mb-3">
				<label for="department_id" class="col-sm-3 col-form-label">Department
					ID:</label>
				<div class="col-sm-9">
					<form:input path="department_id"  id="department_id"
						class="form-control" />
				</div>
			</div>
			<div class="row mb-3">
				<label for="salary" class="col-sm-3 col-form-label">Salary:</label>
				<div class="col-sm-9">
					<form:input path="salary"  id="salary" class="form-control" />
				</div>
			</div>
			<div class="row">
				<div class="col-sm-9 offset-sm-3">
					<button type="submit" class="btn btn-primary">Update</button>
					<button type="reset" class="btn btn-secondary">Reset</button>
					<a href="/show" class="btn btn-warning">Back</a>
				</div>
			</div>
		</form:form>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
