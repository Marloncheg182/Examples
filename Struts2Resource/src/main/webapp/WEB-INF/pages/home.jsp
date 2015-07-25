<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html">
    <title>Struts2 Localization Example</title>
</head>
<body>
<s:form action="welcome">
    <s:textfield key="global.username" name="username"></s:textfield>
    <s:textfield key="global.address" name="address"></s:textfield>
    <s:select list="{'en_US', 'fr_FR', 'ru_RU'}" name="locale" key="global.selectlocale"></s:select>
    <s:submit key="global.submit" name="submit"></s:submit>
</s:form>
</body>
</html>
