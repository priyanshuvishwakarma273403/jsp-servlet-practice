<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <h2>Login Successful</h2>
    <p>Welcome, <%= request.getAttribute("username") %>!</p>
</body>
</html>