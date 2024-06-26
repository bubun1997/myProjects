<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>

	<style>
	  .btn{
	      cursor: pointer;
	  
	  }
	</style>
</head>
<body>
<center>
		
		<form action="add/car" method="post" enctype="multipart/form-data">
		
		   <input type="text" name="carId" placeholder="Enter Car id...." /><br><br>
		   <input type="text" name="carName" placeholder="Enter Car name...." /><br><br>
		   <input type="text" name="carPrice" placeholder="Enter Car Price...." /><br><br>
		   <input type="file" name="myFile" /> <br><br>
		   
		   <button type="submit" class="btn">Add</button>
		   
		   
		   
		
		
		</form>
		 
</center>
</body>
</html>