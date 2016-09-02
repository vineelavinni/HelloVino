<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login form</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


</head>

<body>


	<form action="perform_login" method="post">
		

			<div class="panel-body">
				<div class="form-group">
					<label for="text">UserName:</label> <input type="text"
						name="username" class="form-control"  placeholder="Enter username">
				</div>
			</div>


			<div class="panel-body">
				<div class="form-group">
					<label for="pwd">Password:</label> <input type="password"
						name="password" class="form-control"  placeholder="Enter password">
				</div>
			</div>


			
				<button type="submit" value="submit" class="btn btn-default">Submit</button>
			</div>
		</div>

	</form>

</body>
</html>