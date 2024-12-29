<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Record</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">

</head>
<body>
	<div class="container">
		<div class="box">
			<h1 class="text-center m-4 text-info">Welcome To View Page</h1>
		</div>
		<div class="box d-flex ">
			<h1>
				<a href="/"> <span class="btn btn-primary me-3">Home</span>
				</a>
			</h1>
			<h1>
				<a href="/add"> <span class="btn btn-primary">Add
						Customer</span>
				</a>
			</h1>
		</div>
		<div class="box">
			<c:choose>
				<c:when test="${!empty customers}">
					<table border="1" class="table table-hover">
						<tr style="background-color: yellow;">
							<th>cno</th>
							<th>name</th>
							<th>camt</th>
							<th>products</th>
							<th>Action</th>

						</tr>
						<c:forEach var="cust" items="${customers}">
							<tr style="background-color: gray;">
								<td>${cust.cno}</td>
								<td>${cust.name}</td>
								<td>${cust.camt}</td>
								<td>${cust.products}</td>
								<td><a href="/update?cno=${cust.cno}"><i
										class="btn btn-success bi bi-pen me-3"></i></a> <a
									href="/delete?cno=${cust.cno}"> <i
										class="btn btn-danger bi bi-trash" onclick="message()"></i></a></td>
							</tr>
						</c:forEach>
					</table>
				</c:when>
				<c:otherwise>
					<h1 style="color: red;">Customer is not found</h1>
				</c:otherwise>
			</c:choose>
		</div>

	</div>
	<script type="text/javascript">
		function message() {
			aleart("Do you want to delete.")
		}
	</script>
</body>
</html>