<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page isELIgnored = "false" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Data</title>
</head>
<body>

<h3>
    ********* Student Details ********* <br><br>
	Id : ${student_details.studentId}<br><br>
	Name : ${student_details.studentName}<br><br>
	Email : ${student_details.email}<br><br>
	Mobile No : ${student_details.mobileNumber}
	
</h3>

<hr>
<a href="about">About us</a>

</body>
</html>