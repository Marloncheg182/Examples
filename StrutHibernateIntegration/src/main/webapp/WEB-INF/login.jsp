<%@page language="java" contentType="text/html; ISO-8859-1" pageEncoding="US-ASCII" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%--Using Struts2 Tags in JSP--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html">
    <title>Login Page</title>
</head>
<body>
<h3>Welcome User, please login below</h3>
<s:form action="login">
    <s:textfield name="model.id" label="User ID"></s:textfield>
    <s:textfield name="model.password" label="Password" type="password"></s:textfield>
    <s:submit value="Login"></s:submit>
</s:form>
</body>
</html>