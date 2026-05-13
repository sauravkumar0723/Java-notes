<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

     <%
        if(request.getParameter("error")!=null) {
      %>	
            <p style="color: red;">Invalid username Or Password</p>
      <%
             }
      %>
     
        
        <form action="/doLogin" method="post">
               <input type="text" name="user" placeholder="Enter username"><br>
               <input type="text" name="pass" placeholder="Enter Password"><br>
               <button>login</button>
        
        
        </form>
        
        
</body>
</html>