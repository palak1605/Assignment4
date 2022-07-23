<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<link href="style.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="container">
		<div class="card w-50 mx-auto my-5 border-primary mb-3">
			<div class="card-header border-primary text-left mb-3">Login</div>
			<div class="card-body">
				<form action="Login" method="get">
					<div class="form-group">
						<label>Username</label><input type="text" name="uname"
							class="form-control" required>
					</div>
					<div class="form-group">
						<label>Password</label> <input type="password" name="password"
							class="form-control" required>
					</div>

					<div class="card-footer border-primary mb-3">
						<div class="text-center">
							<a href="#">Forgotten your Password</a>
						</div>
						<div class="text-right">
							<button type="submit" class="btn btn-outline-dark">Login>></button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>