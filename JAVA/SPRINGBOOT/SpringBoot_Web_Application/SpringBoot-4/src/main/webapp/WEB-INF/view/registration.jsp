<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

${msg}
<h1>This is my registration page</h1>
     <form action="save" method="post">
          <input typer="text" name="id" placeholder="enter id"> <br>
          <input typer="text" name="name" placeholder="enter name"> <br>
          <input typer="text" name="password" placeholder="enter password"> <br>
          <input typer="text" name="address" placeholder="enter address"> <br>
          <input typer="text" name="salary" placeholder="enter salary"> <br>   
          <button>save</button> 
     </form>
</body>
</html>