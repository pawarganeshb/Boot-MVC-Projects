<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Add Employee</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	<div class="container mt-5">
		<div class="card">
			<div class="card-header bg-primary text-white">
				<h3 class="text-center">Add Employee Details</h3>
			</div>
			<div class="card-body">
				<!-- Spring Form Binding -->
				<form:form modelAttribute="employee">
					<div class="form-group">
						<label name="name" class="form-label">Name</label>
						<form:input path="name"  class="form-control"
							placeholder="Enter employee name" />
					</div>
					<div class="form-group">
						<label path="department_id" class="form-label">Department
							ID</label>
						<form:input path="department_id" class="form-control"
							placeholder="Enter department ID" />
					</div>
					<!-- <div class="form-group">
						<label path="salary" class="form-label">Salary</label> <input
							path="salary" class="form-control"
							placeholder="Enter salary amount" />
					</div> -->
					<div class="form-group">
						<label path="salary" class="form-label">Salary</label>
						<form:input path="salary" class="form-control"
							placeholder="Enter salary amount" />
					</div>

					<div class="form-group text-center">
						<button type="submit" class="btn btn-success">Submit</button>
						<button type="reset" class="btn btn-secondary">Reset</button>
						<a href="<c:url value='/show' />" class="btn btn-info">Back</a>
					</div>
				</form:form>
			</div>
		</div>
	</div>

	<!-- Bootstrap JS and dependencies -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.4.4/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>