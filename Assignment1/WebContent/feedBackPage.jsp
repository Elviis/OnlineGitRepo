<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
	crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css"
	integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r"
	crossorigin="anonymous">
<link rel="stylesheet" href="bootstrap.css">
<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
	integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS"
	crossorigin="anonymous"></script>
<title>Department FeedBack</title>

</head>
<body>

	<div class="form-group">

		<form class="form-horizontal" method="post" action="HomeController">
			<fieldset>
				<legend class="label label-primary">
					<h1>Department Feedback</h1>
				</legend>
				<div class="form-group">
					<p align="center">
						<select name="depatmentSelect">
							<option selected="selected">Select Department</option>
							<option value="cService">Customer Service</option>
							<option value="billing">Billing</option>
							<option value="sales">Sales</option>
							<option value="tSupport">Technical Support</option>
						</select>
					</p>
					<div class="form-group" text-align="center">
						<p align="center">

							<textarea rows="4" cols="30" name="fbArea" required></textarea>
							
							
							<br> <br>
						</p>
					</div>
					<div></div>
					<div class="form-group">
						<div class="form-group">
							<p align="center">
								<button type="submit" class="btn btn-primary">Submit</button>
							</p>
						</div>
					</div>
			</fieldset>
		</form>
</body>
</html>