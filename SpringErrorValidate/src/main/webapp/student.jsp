<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>

</head>
<body>
<h2>Sign in the system</h2>
<form:form method="post" commandName="student">
  <table>
    <tr>
      <td>Enter your name:</td>
      <td><form:input path="name"/></td>
      <td><form:errors path="name" cssClass="color: #ff0000;"/> </td>
    </tr>
    <tr>
      <td>Enter your last name:</td>
      <td><form:input path="lastName"/></td>
      <td><form:errors path="lastName" cssClass="color: #ff0000;"/></td>
    </tr>
    <tr>
      <td><input type="submit" name="submit" value="Submit"></td>
    </tr>
  </table>
</form:form>
</body>
</html>
