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
            <a class="navbar-brand" href="#">TeamFire, TimeSheet</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <form class="navbar-form navbar-right">
                <div class="form-group">
                    <input type="text" placeholder="Email" class="form-control">
                </div>
                <div class="form-group">
                    <input type="password" placeholder="Password" class="form-control">
                </div>
                <button type="submit" class="btn btn-success">Sign in</button>
            </form>
        </div><!--/.navbar-collapse -->
    </div>
</nav>

<!-- Main jumbotron for a primary marketing message or call to action -->
<
<div class="container">
    <!-- Example row of columns -->



    <div id="addProduct" class="modal fade" role="dialog">
        <div class="modal-dialog">
            <!-- Modal content-->
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">Sign up</h4>
                </div>
                <div class="modal-body">

                    <form action="<c:url value="/signup"/>" method="POST"
                          class="form-horizontal">
                        <input type="hidden" name="${_csrf.parameterName}"
                               value="${_csrf.token}" />
                        <div class="form-group">
                            <label class="col-md-4 control-label">Firstname:</label>
                            <div class="col-md-4">
                                <input type="text" class="form-control" name="firstname"
                                       placeholder="Firstname" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-md-4 control-label">Lastname:</label>
                            <div class="col-md-4">
                                <input type="text" class="form-control" name="lastname"
                                       placeholder="Lastname" />
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-md-4 control-label">Username:</label>
                            <div class="col-md-4">
                                <input type="text" class="form-control" name="username"
                                       placeholder="Username" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-md-4 control-label">Password:</label>
                            <div class="col-md-4">
                                <input type="password" class="form-control" name="password"
                                       placeholder="Password" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-md-4 control-label">Street</label>
                            <div class="col-md-4">
                                <input type="text" class="form-control" name="street"
                                       placeholder="Street" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-md-4 control-label">City:</label>
                            <div class="col-md-4">
                                <input type="text" class="form-control" name="city"
                                       placeholder="city" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-md-4 control-label">State:</label>

                            <div class="col-md-4">
                                <input type="text" class="form-control" name="state"
                                       placeholder="State" />
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-md-4 control-label">Zip:</label>
                            <div class="col-md-4">
                                <input type="text" class="form-control" name="zip"
                                       placeholder="Zip code" />
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-8 col-md-offset-4">
                                <input type="submit" class="btn btn-primary" value="Sign up" />
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>




    <hr>

    <footer>
        <p>&copy; 2017 TeamFire, Inc.</p>
    </footer>
</div> <!-- /container -->


<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"><\/script>')</script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
</body>
</html>
