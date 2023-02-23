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
	<nav style="background-color: pink;">
		<div class="container-fluid">
			<a> <img alt=""
				src="https://www.pngitem.com/pimgs/m/697-6973849_airindia-hd-png-download.png"
				width="400" height="100" />
				
			</a> <a href="aeroplane">Aeroplane</a>
		
			<a href="index.jsp">Home</a>
			
		</div>
	</nav>
	<center>
    <h1>Aeroplane Search:-</h1>
    
    <h3><span style="color: red;">${message}</span></h3>
    <form action="search">
    	Search by Id : <input type="text" name="id"/>
    	<input type="submit" value="Search">
    </form>
    	<div><h1>
    		Search Results: <br>
    		Company : ${dto.companyName} <br>
    		Name : ${dto.name} <br>
    		Cost : ${dto.cost} <br>
    		Type : ${dto.type} <br>
    		Country : ${dto.country}
    	</h1></div>
    	</center>
    	</div>
		
</body>
</html>