<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>

    <h2>Login Form</h2>
    <form  method="post">
        <label>Enter Name</label> <br>
        <input type="text" name="name" placeholder="Enter your name" required> <br> <br>
        
        <label>Enter Password</label> <br>
        <input type="password" name="pass" placeholder="Enter your password" required> <br> <br>
        
        <input type="submit" value="Login"> 
        <input type="reset" value="Clear">
    </form>

    <p style="color:red;">${error}</p>

</body>
</html>