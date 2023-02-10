<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Eclipse Software</title>
</head>
<body>
	<h1>Welcome to jsp world</h1>
	<h2>Sending The Details Of Your Favorite Person</h2>
	<form action="jsp" method="get">
		<pre>
        First Name:<input type="text" name="fname"/>
        Last Name:<input type="text" name="lname"/>
        Gender :
          Female<input type="radio" name="gender" value="female" required="required"/> Male<input type="radio" name="gender" value="male" required="required"/>
        Reason:<input type="textarea" name="reason" />
        Address:<input type="textarea" name="address"/>
        <input type="submit" value="Send"/>       
        </pre>
	</form>
</body>
</html>