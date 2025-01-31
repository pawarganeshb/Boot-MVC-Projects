<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>

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
<body
	class="bg-light d-flex justify-content-center align-items-center vh-100">

	<div
		class="card d-flex justify-content-center align-items-center m-auto shadow-lg p-4 bg-white rounded"
		style="width: 380px;">
		<h2 class="text-center text-primary fw-bold">
			<i class="bi bi-person-plus-fill"></i> Registration
		</h2>

		<div class="text-danger text-center fw-semibold">${msg}</div>

		<form action="register" method="post" class="mt-3">
			<div class="mb-3">
				<label for="username" class="form-label fw-semibold">Username:</label>
				<input type="text" id="username" name="name" class="form-control"
					placeholder="Enter username" required>
			</div>

			<div class="mb-3">
				<label for="password" class="form-label fw-semibold">Password:</label>
				<input type="password" id="password" name="password"
					class="form-control" placeholder="Enter password" required>
			</div>

			<div class="mb-3">
				<label for="email" class="form-label fw-semibold">Email:</label> <input
					type="email" id="email" name="email" class="form-control"
					placeholder="Enter email" required>
			</div>

			<div class="mb-3">
				<label for="fullname" class="form-label fw-semibold">Full
					Name:</label> <input type="text" id="fullname" name="fullName"
					class="form-control" placeholder="Enter full name" required>
			</div>

			<button type="submit" class="btn btn-primary w-100">
				<i class="bi bi-check-lg"></i> Register
			</button>
		</form>

		<div class="text-center mt-3">
			<p class="mb-1">
				Already have an account? <a href="/login"
					class="text-decoration-none">Login here</a>
			</p>
		</div>
	</div>

</body>
</html>
