
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta http-equiv="Content-Type" content="text/html" charset="utf-8">
    <link rel="stylesheet" type="text/css" href="../static/Mainpage.css">
    <link rel="stylesheet" type="text/css" href="../static/reg.css">
    <link rel="stylesheet" type="text/css" href="../static/navigation.css">
    <link rel="stylesheet" type="text/css" href="../static/bootstrap-grid.css" >
    <link rel="stylesheet" type="text/css" href="../static/bootstrap-reboot.min.css" >
    <link rel="stylesheet" type="text/css" href="../static/bootstrap-reboot.css" >
    <link rel="stylesheet" type="text/css" href="../static/bootstrap.min.css" >
    <link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

    <script type="text/javascript" src="../static/regValid.js"></script>
    <title>Registration</title>
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
    <div id="registration">
        <h1 align="center">Registration</h1>
    <form action="/signUp" method="post">
        <label for="">Email</label> <input  name="email" placeholder="Email">
        <label for="">Password</label><input  type="password" name="password" placeholder="Пароль">
        <label for="">Birthday</label><input  type="date" name="date"  placeholder="01/01/1900">
        <label>Gender</label><br>
        <div id="gender">
        <label for="">Male</label><input id="male"  type="radio" value = "M" name="gender" >
        <label for="">Female</label><input id="female" type="radio" value = "F" name="gender" >
        </div>
        <label for="">Country</label><br>
        <select name="country" >
            <option name="country">France</option>
            <option name="country">USA</option>
            <option name="country">Russia</option>
        </select><br>
        <input class="btn btn-outline-dark btn-sm" id="button" type="submit" onclick="valid(document.getElementById(registration))" value="Registration">
    </form>
</div>
</body>
</html>
