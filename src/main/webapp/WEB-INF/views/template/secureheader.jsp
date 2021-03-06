<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: Abel
  Date: 2/5/2017
  Time: 10:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">
    <title>TeamFire TimeSheet Web Application</title>

    <!-- Bootstrap core CSS -->
    <link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/main.css"/>" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="<c:url value="/resources/css/jumbotron.css"/>"  rel="stylesheet">

</head>

<body>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Fire-TimeSheet</a>
        </div>




        <ul class="nav navbar-nav">
            <sec:authorize access="hasRole('ROLE_STUDENT')">
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Student <span class="caret"></span></a>
                <ul class="dropdown-menu">
                    <li><a href="#"></a></li>
                    <li><a href="/my/attendance">View My Attendance</a></li>
                    <li role="separator" class="divider"></li>
                    <li><a href="#">My Profile</a></li>
                </ul>
            </li>
            </sec:authorize>
            <sec:authorize access="hasRole('ROLE_FACULTY')">
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Faculty <span class="caret"></span></a>
                <ul class="dropdown-menu">
                    <li><a href="#"></a></li>
                    <li><a href="/student/attendance">View Attendance</a></li>
                    <li role="separator" class="divider"></li>
                    <li><a href="#">Upload Attendance</a></li>
                </ul>
            </li>

            </sec:authorize>
            <sec:authorize access="hasRole('ROLE_ADMIN')">
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Admin <span class="caret"></span></a>
                <ul class="dropdown-menu">
                    <li><a href="#"></a></li>
                    <li><a href="/student/list">Manage Student</a></li>
                    <li role="separator" class="divider"></li>
                    <li><a href="/course/list">Manage Course</a></li>
                    <li role="separator" class="divider"></li>
                    <li><a href="/csession/list">Manage Sessions</a></li>
                </ul>
            </li>
            </sec:authorize>
        </ul>
        <sec:authentication var="principal" property="principal" />
        <div id="navbar" class="navbar-collapse collapse">
            <form action="/login" class="navbar-form navbar-right">
                <sec:authorize access="isAuthenticated()">
                    <button class="btn btn-primary">Welecome ${principal.username} You have logged in as ${principal.authorities} </button>
                </sec:authorize>

                <button type="submit" class="btn btn-success">Sign Out</button>
            </form>
        </div><!--/.navbar-collapse -->
    </div>
</nav>
<p></p>
<p></p>