<%-- 
    Document   : Sign in
    Created on : Jun 14, 2017, 12:19:09 PM
    Author     : Collins
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Log In</title>

        <!-- Bootstrap core CSS -->
        <link href="resources/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="resources/signin.css" rel="stylesheet">
    </head>
    <body>

        <div class="container">

            <form class="form-signin" action="LoginServlet" method="POST">
                <h2 class="form-signin-heading">Please sign in</h2>

                <input type="text" name="Username" class="form-control" placeholder="Username" required autofocus>

                <input type="password" name="Password" class="form-control" placeholder="Password" required>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" value="remember-me"> Remember me
                    </label>
                </div>
                <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
                
            </form>

        </div> <!-- /container -->



    </body>
</html>
