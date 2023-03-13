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
   
   <nav class="navbar navbar-expand-lg navbar-light bg-dark">
        <div class="container-fluid">
        <a class="navbar-brand" href="#"
        class="d-inline-block align-text-top">
        <img src="https://www.shutterstock.com/image-photo/bottles-nail-polish-on-colorful-260nw-380869621.jpg"
        alt="" 	width="400" height="100"></a>
        
        </a> <a href="index.jsp">Home</a>
    <ul>
        <li style="display: inline-block; paddind: 20px;">
               <a href="Nailpolish" class="col-lg-2 col-sm-2">Register</a>
        <li style="display: inline-block;"><a href="NailpolishSearch.jsp"
             class="col-lg-2 col-sm-2">Search</a>
             
         <li style="display: inline-block;"><a href="BrandSearch.jsp"
              class="col-lg-2 col-sm-2">Search By BrandName</a>
    </ul> 
        
   </div>
   </nav>
   
   <h1>WELCOME TO BRAND NAME SEARCH PAGE</h1>
   <form action="searchByBrandName" method="get">
   <h3><span style="color: red;">${message}</span></h3>
       Search By BrandName: <input type="text" name="brandName" />
       <input type="submit" value="Search"/>
   </form>
   <div>
       <table border="1">
         <tr>
             <th>Id</th>
             <th>Name</th>
             <th>BrandName</th>
             <th>Color</th>
             <th>Price</th>
             <th>Quality</th>
             <th>Update</th>
             <th>Delete</th>
        </tr>  
        <c:forEach items="${list}" var="t">
        <tr>
           <td>${t.id}</td>
           <td>${t.name}</td>
           <td>${t.brandName}</td>
           <td>${t.color}</td>
           <td>${t.price}</td>
           <td>${t.quality}</td>
           <td><a href="update?id=${t.id}">Edit</a></td>
           <td><a href="delete?id=${t.id}">Delete</a></td>
        </tr>
       </c:forEach>
         </table>
   </div>
</body>
</html>