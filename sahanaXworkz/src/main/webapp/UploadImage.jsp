<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">
</head>
<body>
	<nav style="background-color: green;">
		<div class="container-fluid">
			<a> <img alt=""
				src="https://www.shutterstock.com/image-photo/bottles-nail-polish-on-colorful-260nw-380869621.jpg"
				width="400" height="100" />

			</a> <a href="index.jsp">Home</a>
		</div>
	</nav>
	
	<h1>Upload Image Test</h1>
	<h3 style="color: green;">${successmessage}</h3>
	<h3 style="color: red;">${errormessage}</h3>
	
     <form action="upload" method="post" enctype="multipart/form-data">
     Upload* : <input type ="file" name="file"/>
     <input type="submit" value="Upload"> 
     
     </form>
     </body>
</html>