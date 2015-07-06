<%--suppress ALL --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE HTML>
<html>
<head>
    <style>
        body {
            background-color: #eee;
            font-family: helverica;
        }

        #container {
            width: 500px;
            background-color: #fff;
            margin: 30px auto;
            padding: 30px;
            border-radius: 5px;
        }

        .green {
            font-weight: bold;
            color: green;
        }

        .message {
            margin-bottom: 10px;
        }

        label {
            width: 70px;
            display: inline-block;
        }
        input {
            display: inline-block;
            margin-right: 10px;
        }

        form {
            line-height: 160%;
        }

        .hide {
            display: none;
        }

        .error {
            color: red;
            font-size: 0.9em;
            font-weight: bold;
        }
    </style>
</head>
<body>
<div id="container">
    <c:if test="${not empty message}">

    </c:if>
    <form:form action="valid" modelAttribute="user">
    <label for="nameInput">Name: </label>
    <form:input path="name" id="nameInput"/>
    <form:errors path="name" cssClass="error"/>
    <br/>

    <label for="phoneInput">Phone: </label>
    <form:input path="phone" id="phoneInput"/>
    <form:errors path="phone" cssClass="error"/>
    <br/>
        <label for="dateInput">Birthday: </label>
        <form:input path="date" id="dateInput" placeholder="MM/DD/YYYY"/>
        <form:errors path="date" cssClass="error"/>
        <br/>
        <br/>
<input type="submit" value="submit"/>
    </form:form>
</div>
</body>
</html>