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
				
			</a> <a href="index.jsp">Home</a>
		</div>
	</nav>
	<center>
<h1>Welcome to Aeroplane data saving</h1>
</center>
  <center>
    <c:forEach items="${errors}" var="e">
    <span style ="color:red;">${e.message}</span>
    </c:forEach>

    <form action="aeroplane" method="post">
    <pre> <h3>
    Company Name : <input type="text" name="companyName" value="${dto.companyName}"/>
    Name : <input type="text" name="name" value="${dto.name}"/>    
    Cost : <input type="text" name="cost"  value="${dto.cost}"/>
    Type : <select name="type">
                 <option value="${dto.type}">SELECT</option>
                 <c:forEach items="${type}" var="t">
                 	<option value="${t}">${t}</option>
                 </c:forEach> 
    
    </select>
       
    Country : <select name="country">
                     <option value="">Select</option>
                     <c:forEach items ="${country}" var ="c">
                          <option value="${c}">${c}</option>
                     </c:forEach>
    
    </select>
    
    <input type="submit" value="register"/>
    
      </h3></pre>
     </form></center>
   </body> 
    
</html>