<%--
  Created by IntelliJ IDEA.
  User: tri
  Date: 4/29/20
  Time: 12:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register to Tri's Website</title>
    <link rel="stylesheet" href="css/auth2.css">
</head>
<body>
    <h1>Member registration</h1>
    <form action="store" method="post">
        <table>
            <tr><td>Fullname:</td><td><input type="text" name="fullname"/></td></tr>
            <tr><td>Email:</td><td><input type="text" name="email"/></td></tr>
            <tr><td>Username:</td><td><input type="text" name="username"/></td></tr>
            <tr><td>Password:</td><td><input type="text" name="password"/></td></tr>
            <tr><td>Confirm password:</td><td><input type="text" name="confirm_password"/></td></tr>
        </table>
        <input type="submit" value="register"/>
    </form>
</body>
</html>
