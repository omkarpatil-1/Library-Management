<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %> <%@page isErrorPage="false" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">


th {
	background-color: skyblue;
}

h1{
  border: 2px outset red;
	color: Darkblue;
	background-color: lightgrey;
}

button {
	width: 20%;
}
</style>
<meta charset="ISO-8859-1">




</head>
<body>

 
</table>
  <div align="center" class="div">
        <table border="2px" cellpadding="1px" style="width:50%" >
            <caption><h1>--------| BOOK |--------- </h1></caption>
            <tr>
                <th>BOOK ID</th>
                <th>BOOK NAME</th>
                <th>BOOK PRICE</th>
              
            </tr>
          
                <tr align="center">
                    <td>${bid}</td>
                    <td>${bname}</td>
                    <td>${bprice}</td>

                </tr>
                  
              </table>
              <br>
              
              
              <form action="edit">
              <div hidden="text">
              <input value="${bid}" name="bid">
              </div>
               <button type="submit">Edit</button> 
              </form>
              
            

</body>
</html>