<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=200">
 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">  
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>second page</title>
</head>
<style>
.jumbotron{

background-color: lightblue;	
}
</style>
<body>
<div class="jumbotron text-center">
	<div class="container">
	<h2>Registration Form</h2>
		<form action="success" method ="POST">
			<div class="form-group">
				<label for="fname">First Name:</label> <input type="text" class="form-control"
					name="fname" />
			</div>
			<div class="form-group">
				<label for="lname">Last Name:</label> <input type="text"  class="form-control"
					name="lname" />
			</div>
			<div class="form-group">
				<label for="Address">Address:</label>
				<textarea rows="5" cols="10" class="form-control" name="address"></textarea>
			</div>
			<div class="form-group">
				<label for="Gender">Gender:</label> <input type="radio" 
					name="gender" value="Male" />Male <input type="radio" 
					name="gender" value="Female" />Female
			</div>
			<div class="form-group">
				<label for="Languages">Languages:</label> 
			</div>
			<div class="form-group">
				<input type="checkbox" name="language" value="Java" />Java 
				<input type="checkbox" name="language" value=".Net" />.net 
				<input type="checkbox" name="language" value="C/C++" />C/C++
			</div>
			<button type="submit" class="btn btn-success">Submit</button>
		</form>
	</div>
	
	</div>
</body>
</html>