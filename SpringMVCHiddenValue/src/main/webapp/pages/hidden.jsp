<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Spring MVC hidden value example</title>
</head>
<body>
<form:form method="post" commandName="hiddenMessage">
  <h2>Do you know what hidden message is?</h2>
  <table>
    <tr>
      <input name="message" type="hidden" value="This is a hidden value"/>
    </tr>
    <tr>
      <td><input type="submit" name="submit" value="Click it!"></td>
    </tr>
  </table>
</form:form>
</body>
</html>
