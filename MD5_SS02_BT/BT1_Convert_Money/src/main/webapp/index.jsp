<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 5/25/2023
  Time: 10:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hello</h1>
<h2>Convert Money USD --> VND</h2>
<form action="/convert" method="get">
    <label>Please enter your money</label> <br>
    <input type="number" name="money">
    <button type="submit">Convert</button>
</form>
</body>
</html>
