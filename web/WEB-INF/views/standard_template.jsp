<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Tri's site</title>
    <link rel="stylesheet" href="./css/standard.css">
</head>
<body>


<div id="navbar">
    <img id="logo" src="./assets/logo.png" alt="logo">
    <ul>
        <li><a href="./index">Index</a></li>
        <li><a href="./about">About</a></li>
        <li><a href="./hobby">Hobbies</a></li>
        <li><a href="./artwork">Artworks</a></li>
        <li><a href="./major">Major</a></li>
        <li><a href="./blog_collection">Blog collection</a></li>
        <li><a href="./login">Login page</a></li>
    </ul>
</div>

<div id="audio">
    <audio controls>
        <source src="./assets/V.m4a" type="audio/mp4">
    </audio>
</div>

<div id="main">
    <article>
        <header><h1>${requestScope["header"]}</h1></header>
        <p>${requestScope["header_text"]}</p>
    </article>

    <article id="content">
        ${requestScope["content"]}
    </article>
</div>

</body>
</html>
