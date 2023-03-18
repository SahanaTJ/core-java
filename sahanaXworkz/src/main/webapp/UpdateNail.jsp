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
	<nav style="background-color: blue;">
		<div class="container-fluid">
			<a> <img alt=""
				src="https://www.shutterstock.com/image-photo/bottles-nail-polish-on-colorful-260nw-380869621.jpg"
				width="400" height="100" />

			</a> <a href="index.jsp">Home</a>
		</div>
	</nav>
	<center>
		<h1>Welcome to NailPolish data Update</h1>
		<c:forEach items="${errors}" var="e">
			<span style="color: red;">${e.message} <br></span>
		</c:forEach>
		<span style="color: green;">${message}</span>
		<form action="update" method="post">
			<pre> <h3>
	Id : <input type="number" name="id" value="${dto.id}"
						readonly="readonly" />		
    Name : <input type="text" name="name" value="${dto.name}" />
    BrandName : <input type="text" name="brandName"
						value="${dto.brandName}" readonly="readonly" />
    Color : <select name="color">
                  <option value="${dto.color}">${dto.color}</option>
    				<c:forEach items="${color}" var="col">
    				<option value="${col}">${col}</option>
    				</c:forEach>
			</select>
    Price : <input type="number" name="price" value="${dto.price}" />
    Qulaity : <select name="quality">
              <option value="${dto.quality}">${dto.quality}</option>
                 <c:forEach items="${quality}" var="q">
                 	<option value="${q}">${q}</option>
                 </c:forEach> 
     			</select>
     <input type="submit" value="Update" class="btn btn-primary"/>
    </h3>
		</pre>
		</form>
	</center>
	</form>
</body>

</html>