<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>

 <center>
   
   <form action="add/employee" method="post">
   
      <input type="text" name="employeeId" placeholder="Enter id...."/><br><br>
   	  <input type="text" name="employeeName" placeholder="Enter name...."/><br><br>
      <input type="text" name="employeeDepartment" placeholder="Enter department name...."/><br><br>
      
      <button type="submit">Add Employee</button>
      
   
   </form>
   
   <hr>
   
   <form action="get/employee">
   
      <input type="text" name="eid" placeholder="Enter Employee Id...."><br><br>
      <button type="submit">Get Employee</button>
      
   </form>
 
 </center>

</body>
</html>