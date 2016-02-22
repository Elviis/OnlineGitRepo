<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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

<title>Vote for Your Song of the year!</title>
</head>
<body>

<div class="form-group">

		<form class="form-horizontal" method="post" action="HomeController">
			<fieldset>
				<legend class="label label-primary">
					<h1>Voting</h1>
				</legend>
				<div class="form-group">
				<p align="center">
				 Please Enter Your Email Below:
				 </p>
				 <p align="center">
				 
					<input name="email" type="text"/><br /> 
					<br />
						<select name="selectSong1" required>
							<option selected="firstSelect">First Choice</option>
							<option value="tSwift">Bad Blood - Taylor Swift</option>
							<option value="theWeeknd">Can't Feel My Face - The Weeknd</option>
							<option value="ellieG">Love Me Like You Do - Ellie Golding</option>
							<option value="wKhalifa">See You Agaim - Wiz Khalifa</option>
							<option value="jBieber">What Do You Mean - Justin Beiber</option>
						</select>
					</p>
					<p align="center">
						<select name="selectSong2">
							<option selected="secondSelect">Second Choice</option>
							<option value="tSwift2">Bad Blood - Taylor Swift</option>
							<option value="theWeeknd2">Can't Feel My Face - The Weeknd</option>
							<option value="ellieG2">Love Me Like You Do - Ellie Golding</option>
							<option value="wKhalifa2">See You Agaim - Wiz Khalifa</option>
							<option value="jBieber2">What Do You Mean - Justin Beiber</option>
						</select>
					</p>
					<p align="center">
						<select name="selectSong3">
							<option selected="thirdSelect">Third Choice</option>
							<option value="tSwift3">Bad Blood - Taylor Swift</option>
							<option value="theWeeknd3">Can't Feel My Face - The Weeknd</option>
							<option value="ellieG3">Love Me Like You Do - Ellie Golding</option>
							<option value="wKhalifa3">See You Agaim - Wiz Khalifa</option>
							<option value="jBieber3">What Do You Mean - Justin Beiber</option>
						</select>
					</p>
					
					<div class="form-group">
						<div class="form-group">
							<p align="center">
								<button type="submit" class="btn btn-primary">Submit</button>
							</p>
						</div>
					</div>
			</fieldset>
		</form>

					<table class="table table-striped table-hover">
						<tbody class="success">
							<tr>
							
								<td align="left">Total Unique Votes:  ${totalUniqueVotes}</td>
								<td align="left">Taylor Swift Rank:  ${RANKtswift}</td>
								<td align="left">TheWeeknd Rank:  ${RANKtheweeknd}</td>
								<td align="left">Wiz Khalifa Rank:  ${RANKwkhalifa}</td>
								<td align="left">Justin Bieber Rank:  ${RANKjbieber}</td>
								
							</tr>
						</tbody>	
					</tbody>

</body>
</html>