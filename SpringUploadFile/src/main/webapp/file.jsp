<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title></title>
</head>
<body>
<h2>File Uploader</h2>
<form:form method="post" commandName="file" enctype="multipart/form-data">
  Upload your file please:
  <input type="file" name="file"/>
  <input type="submit" value="upload"/>
  <form:errors path="file" cssClass="color:#ff0000;"/>
</form:form>
</body>
</html>
