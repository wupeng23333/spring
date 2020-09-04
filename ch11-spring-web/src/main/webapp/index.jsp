<%--
  Created by IntelliJ IDEA.
  User: wupeng
  Date: 2020/8/21
  Time: 21:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生注册</title>
</head>
<body>
<p>注册学生</p>
<form action="reg" method="post">
<table>
    <tr>
        <td>id:</td>
        <td><input type="text" name="id"></td>
    </tr>
    <tr>
        <td>name:</td>
        <td><input type="text" name="name"></td>
    </tr>
    <tr>
        <td>email:</td>
        <td><input type="text" name="email"></td>
    </tr>
    <tr>
        <td>age:</td>
        <td><input type="text" name="age"></td>
    </tr>
    <tr>
        <td></td>
        <td><input type="submit" value="注册"></td>
    </tr>
</table>
</form>
</body>
</html>
