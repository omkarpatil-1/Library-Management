<%@page import="com.cjc.model.Books"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
h1{
align:"center"; 
color: DarkBlue;
border: 2px outset red;
background-color: lightgrey;



}
input{

	width: 20%;
}
div {
	background-color: skyblue;
	border: 1px outset black;
}


</style>
</head>
<body align="center">

<h1>UPDATE BOOK DETAILS</h1>

<% Books book = (Books)request.getAttribute("data"); %>
<div align="center" >

<form action="up">
<h2>BOOK ID:- <%=book.getBid()%> </h2>  


<input type="hidden" name="bid" value="<%=book.getBid()%>">
<label>NEW BOOK NAME:- </label>
<input type="text" name="name" value="<%=book.getName()%>"><br>
<br>
<label>NEW BOOK PRICE:- </label>
<input type="text" name="bprice" value="<%=book.getBprice()%>"><br>
<br>
<br>
<input type="submit" value="Update">
</form>
<br>
<br>
</div>

</body>
</html>