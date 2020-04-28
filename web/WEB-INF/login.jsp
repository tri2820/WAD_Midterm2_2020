<%--
  Created by IntelliJ IDEA.
  User: tri
  Date: 4/29/20
  Time: 12:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login to Tri's Website</title>
    <link rel="stylesheet" href="css/auth.css">
</head>
<body>

<form action="login" method="post">
    <label> Name </label>
    <input type="text" name="username"/>

    <label> Password </label>
    <input type="password" name="password"/>

    <input id='submit_button' type="submit" value="login"/>
</form>

</body>
</html>
