<!DOCTYPE html>
<html>
<head>
    <title>Authorization</title>
    <meta http-equiv="Content-Type" content="text/html" charset="utf-8">
    <link rel="stylesheet"  href="../static/Mainpage.css">
    <link rel="stylesheet"  href="../static/auth.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <meta http-equiv="Content-Type" content="text/html" charset="utf-8">
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

    <script type="text/javascript" src="../static/authValid.js"></script>

</head>
    <body class="title">
        <div>
            <nav class="navbar navbar-dark bg-dark">
                <a class="navbar-brand"> <img src="../static/logo.jpeg" width="100	" height="100" alt=""></a>
                <h1 style="color:white">The Question</h1>
                <div id="auth">
                </div>
            </nav>
        </div>
        <h1 align="center">Authorization </h1>
        <form name="registration" method="post" action="auth/process" id="form">
            <label for="">Enter your email:</label><input type="email" name="email" placeholder="example@mail.com" id="email" title="Это имя видно другим пользователем" >
            <br>
            <label for="">Enter your password:</label> <input type="password" name="password" id="password"> <br><br>
            <input id="button" type="submit" class="btn btn-outline-dark btn-sm" onclick="valid(document.getElementById('form'))">
        </form>
    </body>
</html>