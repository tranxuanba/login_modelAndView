<%--
  Created by IntelliJ IDEA.
  User: ishopjapan
  Date: 13/09/2022
  Time: 14:07
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h3>Home</h3>
<form:form action="login" method="post" modelAttribute="login">
<fieldset>
    <legen>Login</legen>
    <table>
        <tr>
            <td><form:label path="account">Account:</form:label></td>
            <td><form:input path="account" /></td>
        </tr>
        <tr>
            <td><form:label path="password">Password:</form:label></td>
            <td><form:input path="password" /></td>
        </tr>
        <tr>
            <td><form:button>Login</form:button></td>
        </tr>
    </table>
</fieldset>
</form:form>
</body>
</html>
