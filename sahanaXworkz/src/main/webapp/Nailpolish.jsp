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
	<center>
		<h1>Welcome to NailPolish data saving</h1>
		<c:forEach items="${errors}" var="e">
			<span style="color: red;">${e.message} <br></span>
		</c:forEach>

		<form action="nailpolish" method="post">
			<pre> <h3>
    Name : <input type="text" name="name" value="${dto.name}" />
    BrandName : <input type="text" name="brandName"
						value="${dto.brandName}" />
    Color : <select name="color">
                  <option value="">SELECT</option>
    				<c:forEach items="${color}" var="col">
    				<option value="${col}">${col}</option>
    				</c:forEach>
			</select>
    Price : <input type="number" name="price" />
    Qualiity : <select name="quality">
              <option value="">SELECT</option>
                 <c:forEach items="${quality}" var="q">
                 	<option value="${q}">${q}</option>
                 </c:forEach> 
                 
    </select>
    </h3>
     <input type="submit" value="Perchase" />
    
      
		</pre>
	</center>
	</form>
</body>

</html>