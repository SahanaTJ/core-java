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
	<nav style="background-color: black;">
		<div class="container-fluid">
			<a> <img alt=""
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				width="400" height="100" />
				
			</a> <a href="index.jsp">CM</a>
		</div>
	</nav>
	<h1>Welcome to CM Info</h1>
	
	<form action="egg" method="post">
	<pre>
	CM Name : <input type="text" name="name"/>
    Party<select name="party">
    <option>Select</option>
    <option>BJP</option>
    <option>Congress</option>
    <option>JDS</option>
    <option>AAP</option>
    <option>KJP</option>
    </select>
    
    State :<select name="state">
    <option>Select</option>
    <option>KA</option>
    <option>UP</option>
    <option>KL</option>
    <option>TS</option>
    <option>AP</option>
    <option>KR</option>
    <option>TR</option>
    </select>
    
    Tenure :<select name="tenure">
    <option>Select</option>
    <option>1</option>
    <option>2</option>
    <option>3</option>
    <option>4</option>
    <option>5</option>
    </select>
    
    PortFolio :<textarea rows="3" cols="50" name="portfolio"></textarea>
    <input type ="submit" value ="Save" class ="btn btn-primary"/>
    </pre>
    </form>
</body>
</html>