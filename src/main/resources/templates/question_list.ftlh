
<html>
<head>
    <title>List of questions</title>
    <meta http-equiv="Content-Type" content="text/html" charset="utf-8">
    <link rel="stylesheet" type="text/css" href="../static/logo.css">
    <link rel="stylesheet" type="text/css" href="../static/Mainpage.css">
    <link rel="stylesheet" type="text/css" href="../static/enter.css">
    <link rel="stylesheet"  href="../static/navigation.css">
    <script src="../static/ajax.js"></script>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    <meta http-equiv="Content-Type" content="text/html" charset="utf-8">
    </head>
    <body>
        <div>
            <nav class="navbar navbar-dark bg-dark">
                <a class="navbar-brand"> <img src="/../static/logo.jpeg" width="100	" height="100" alt=""></a>
                <h1 style="color:white">The Question</h1>
                <div id="auth">
                </div>
            </nav>
        </div>
        <div id="main">
            <h5> Here's all questions:</h5> <button onclick="update()">&#x21bb;</button>
            <div id="collection">
                <#list questions as question>
                    <a class="question" href="/questions/${question.id}">${question.body}<br></a>
                </#list>
            </div>
        </div>
    </body>
</html>