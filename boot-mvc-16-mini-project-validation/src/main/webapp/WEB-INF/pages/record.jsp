<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Employee Details</title>
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-icons/1.10.5/font/bootstrap-icons.min.css"
	rel="stylesheet">

<style>
body {
	background-color: #f8f9fa;
}

a {
	text-decoration: none;
}

.table-responsive {
	margin-top: 20px;
}
</style>
</head>
<body>
	<div class="container">
		<c:choose>
			<c:when test="${!empty empList}">
				<h1 class="text-center mt-4">Employee Details</h1>
				<div class="row">
					<div class="col-md-6">
						<a href="/" class="btn btn-primary"> <span class="bi bi-house"></span>
							Home
						</a> <a href="/add" class="btn btn-success"> <span
							class="bi bi-cloud-plus"></span> Add Employee
						</a>
					</div>
				</div>
				<div class="table-responsive">
					<table class="table table-striped table-bordered mt-3">
						<thead class="table-dark">
							<tr>
								<th>ID</th>
								<th>Name</th>
								<th>Department ID</th>
								<th>Salary</th>
								<th class="text-center">Action</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="emp" items="${empList}">
								<tr>
									<td>${emp.getEmp_id()}</td>
									<td>${emp.getName()}</td>
									<td>${emp.getDepartment_id()}</td>
									<td>${emp.getSalary()}</td>
									<td style="text-align: center"><a
										href="/update/${emp.getEmp_id()}" class="btn btn-primary btn-sm">
											<span class="bi bi-pen"> Edit</span>
									</a> <a href="/delete?no=${emp.getEmp_id() }"
										onclick="return confirm('Do you want to delet the employee.')"
										class="btn btn-danger btn-sm"> <span class="bi bi-trash"> Remove</span>
									</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</c:when>
			<c:otherwise>
				<h2 class="text-center text-danger mt-4">No Employee Data
					Available</h2>
				<div class="text-center">
					<a href="/add" class="btn btn-success">Add New Employee</a>
				</div>
			</c:otherwise>
		</c:choose>
	</div>
	<!-- Bootstrap JS Bundle -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js">
		
	</script>
</body>
</html>
	