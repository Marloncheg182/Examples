<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>>
<%@page language="java" contentType="text/html; ISO-8859-1" pageEncoding="ISO-8859-1" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html">
    <title>Login</title>
</head>
<body>
<form:form id="loginForm" method="post" action="login" modelAttribute="loginBean">
    <form:label path="username">Enter your name</form:label>
    <form:input id="username" name="username" path="username"/><br>
    <form:label path="username">Please enter your password</form:label>
    <form:password id="password" path="password" name="password"/><br>
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>