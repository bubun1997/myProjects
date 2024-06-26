<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page isELIgnored = "false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body>
  <h1>
     Id : ${emp.employeeId} <br><br>
     Name : ${emp.employeeName}<br><br>
     Department : ${emp.employeeDepartment}
  
  </h1>
  
  <br><br>
  <a href="../home"> <button>Back</button> </a>
</body>
</html>