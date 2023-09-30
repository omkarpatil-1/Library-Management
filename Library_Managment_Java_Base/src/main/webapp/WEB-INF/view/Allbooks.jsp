<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="com.cjc.model.Books" %>
    <%@page import="java.util.List"%>
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
th {
	background-color: skyblue;
}

</style>
</head>
<script type="text/javascript">


function deletebook() {
	alert("You are deleting a Book ");
	document.myForm.action="delete";
	document.myForm.submit();
	}
</script>
<body align="center">


<script type="text/javascript">


</script>
<body>
<h1>ALL BOOK LIST</h1>
<% List<Books> list=(List<Books>)request.getAttribute("data");%>
<div align="center">
<form name="myForm">
<table border="2px" cellpadding="5px" style="width: 50%">
<thead>
<tr>
<th>SELECT</th>
<th>BOOK ID</th>
<th>BOOK NAME</th>
<th>BOOK PRICE</th>

</tr>
</thead>
<tbody>
<%for(Books books : list){ %>
<tr>
<td><input type="radio" name="bid" value="<%=books.getBid()%>"></td>
<td><%=books.getBid()%></td>
<td><%=books.getName()%></td>
<td><%=books.getBprice()%></td>

</tr>
<%}%>
</tbody>
</table>
<br>

<input type="button" value="DELETE" onclick="deletebook()" style="width: 20%">
</form>
</div>
</body>
</html>



</body>
</html>