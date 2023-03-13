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

	<h1>Nailpolish Search By Two Properties</h1>


	<div class="card bg-light mb-3">
		<span style="color: red"> ${msg}</span>
		<form action="findNameAndColor">
			Search by Name : <input type="text" name="name" /> and Color : <input
				type="text" name="color"> <input type="submit"
				value="Search">
		</form>

		<table class="table caption-top">
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
				<c:forEach items="${list}" var="l">
					<tr>
					<tr>
						<th scope="row">${l.id}</th>
						<td>${l.name}</td>
						<td>${l.brandName}</td>
						<td>${l.color}</td>
						<td>${l.price}</td>
						<td>${l.quality}</td>
						<td><a href="update?id=${l.id}" style="color: red;">Edit</a></td>
						<td><a href="delete?id=${l.id}" style="color: red;">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>