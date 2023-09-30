<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">

h1 {
	color: DarkBlue;
border: 2px outset red;
background-color: lightgrey;
}
div {
	background-color: skyblue;
	border: 1px outset black;
}
input{

	width: 20%;
}
</style>



</head>
<body align="center">
<h1>REGISTER NEW BOOK</h1>

<div class="div">
<br>
  <form action="regsnewbook">
  


Enter Book ID:- <input type="text" name="bid">
 <br>
 <br>

Enter Book Name:-  <input type="text" name="name">
  <br>
  <br>
  Enter Book Price:-  <input type="text" name="bprice">
  <br>
  <br>

  <input type="submit" value="ADD BOOK">
  <br>
  <br>
</form>
</div>
</body>
</html>