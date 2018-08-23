<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">  
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>success page</title>
</head>
<style>
.jumbotron{

background-color: lightblue;	
}

</style>
<body>
<div class="jumbotron text-center">
<h2>Successfully Register</h2>
<div class="container">
<div class="row">
<b>First Name:</b>${fname}
</div>
<div class="row">
<b>Last Name:</b>${lname}
</div>
<div class="row">
<b>Address:</b>${address}
</div>
<div class="row">
<b>Gender:</b>${gender}
</div>
<div class="row">
<b>Language:</b>${language}
</div>
</div>
</div>
</body>
</html>