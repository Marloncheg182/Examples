<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Spring MVC dropdown box</title>
</head>
<body>
<h2>What's your favorite colour?</h2>
<form:form method="post" commandName="colour">
  <table>
    <tr>
      <td>Please select:</td>
      <td><form:select path="colourName">
        <form:option value="" label="......"/>
        <form:options items="${colours}"/>
      </form:select></td>
      <td><form:errors path="colourName " cssClass="color:#ff0000;"/></td>
    </tr>
    <tr>
      <td><input type="submit" name="submit" value="Submit"></td>
    </tr>
  </table>
</form:form>
</body>
</html>
