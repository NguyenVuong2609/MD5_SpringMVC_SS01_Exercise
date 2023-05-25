<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 5/25/2023
  Time: 10:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Simple Dictionary</h1>
<form action="/translate" method="get">
    <label>Your word: </label> <br>
    <input type="text" name="word">
    <button type="submit">Translate</button>
</form>
</body>
</html>
