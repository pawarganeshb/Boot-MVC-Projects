<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>

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
<body>

	<div class="card shadow-lg p-4 bg-white m-auto mt-5 rounded" style="width: 380px;">
		<h2 class="text-center text-primary fw-bold">
			<i class="bi bi-person-circle"></i> Login
		</h2>

		<!-- Error Message -->
		<div class="text-danger text-center fw-semibold">
			<p>${msg}</p>
		</div>

		<form action="login" method="post" class="mt-3">
			<div class="mb-3">
				<label for="email" class="form-label fw-semibold">Email:</label> <input
					type="email" id="email" name="email" class="form-control"
					placeholder="Email" required>
			</div>

			<div class="mb-3">
				<label for="password" class="form-label fw-semibold">Password:</label>
				<input type="password" id="password" name="password"
					class="form-control" placeholder="Password" required>
			</div>

			<button type="submit" class="btn btn-primary w-100">
				<i class="bi bi-box-arrow-in-right"></i>Login
			</button>
		</form>

		<div class="text-center mt-3">
			<p class="mb-1">
				Don't have an account? <a href="/" class="text-decoration-none">Register
					here</a>
			</p>
		</div>
	</div>

</body>
</html>
