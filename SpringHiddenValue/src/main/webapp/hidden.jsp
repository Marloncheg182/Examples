<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Spring MVC hidden value</title>
</head>
<body>
<form:form method="post" commandName="hiddenMessage">
    <h2>Hidden message</h2>
    <table>
        <tr>
            <input name="message" type="hidden" value="Hello!"/>
        </tr>
        <tr>
            <td><input type="submit" name="submit" value="click!"></td>
        </tr>
    </table>
</form:form>
</body>
</html>