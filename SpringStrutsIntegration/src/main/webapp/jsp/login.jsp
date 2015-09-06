<%@include file="include.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html">
    <title>Login</title>
</head>
<body>
<font color="red">${message}</font>
<s:form action="login">
  <s:textfield name="username" label="Enter Name"/><br/>
  <s:password name="password" label="Enter Password"/><br/>
  <s:submit></s:submit>
</s:form>
</body>
</html>
