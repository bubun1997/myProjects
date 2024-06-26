<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
  
  <center>
  
      
 		  Id : ${cars.carId}<br><br> 
 		  Name : ${cars.carName}<br><br>
 		  Price : ${cars.carPrice}<br><br>  
 		 Image : <img alt="Car Image"  src="<c:url value="${path}${cars.myFile.getOriginalFilename()}" />" width="200" height="300"/>
 		     
      
      </table>
  
  </center>
</body>
</html>