<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-COMPATIBLE" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Spring Security</title>

    <!-- Bootstrap core CSS -->
    <link href="<c:url value="css/bootstrap.css"/>" rel="stylesheet">

    <!-- Custom styles for this tamplate-->
    <link href="<c:url value="css/jumbotron-narrow.css"/>" rel="stylesheet">

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries ‐‐>
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->

</head>
<body>
<div class="container">
    <div class="jumbotron" style="margin-top: 20px;">
        <h1>Example Application</h1>
        <p class="lead">
            This is an example application , used within the Spring Security with safety login authorization
        </p>
        <sec:authorize access="!isAuthenticated()">
            <p><a class="btn btn-lg btn-success" href="<c:url value="login.jsp" />" role="button">Log in</a></p>
        </sec:authorize>
    <sec:authorize access="!isAuthenticated()">
        <p>Your login: <sec:authentication property="principal.username"/></p>
        <p><a class="btn btn-lg btn-danger" href="<c:url value="/j_spring_security_logout"/> " role="button">Log out</a></p>
    </sec:authorize>
    </div>
    <div class="footer">
        <p>© Setherial 2015</p>
    </div>
</div>
</body>
</html>
