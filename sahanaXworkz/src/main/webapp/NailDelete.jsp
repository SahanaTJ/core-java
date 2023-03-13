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
				src="https://www.shutterstock.com/image-photo/bottles-nail-polish-on-colorful-260nw-380869621.jpg"
				width="400" height="100" />

			</a> <a href="index.jsp">Home</a>
		</div>
	</nav>
	
	<h1>Welcome to Nailpolish.........</h1>


	<h1></h1>




	<div class="card text-white bg-light mb-3">
		<span style="color: red"> ${msg}</span>


		<table class="table caption-top">
			<caption>Display Detailes of Deleted Data</caption>
			<thead>
				<tr>
					<th scope="col">id</th>
					<th scope="col">Name</th>
					<th scope="col">BrandName</th>
					<th scope="col">Color</th>
					<th scope="col">Price</th>
					<th scope="col">Quality</th>
					
				</tr>
			</thead>
			<tbody>

				<tr>
					<th scope="row">${delete.id}</th>
					<td>${delete.name}</td>
					<td>${delete.brandName}</td>
					<td>${delete.color}</td>
					<td>${delete.price()}</td>
					<td>${delete.quantity()}</td>
					</tr>
		 </tbody>
		</table>
	</div>
</body>
</html>