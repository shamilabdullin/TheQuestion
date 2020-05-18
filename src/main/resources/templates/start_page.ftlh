<html>
    <head>
        <title>The_Question</title>
        <meta charset="utf-8">
        <link rel="stylesheet" href="../static/Mainpage.css">
        <link rel="stylesheet" type="text/css" href="../static/navigation.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

        <meta http-equiv="Content-Type" content="text/html" charset="utf-8">
    </head>
    <body>
    <div>
        <nav class="navbar navbar-dark bg-dark">
            <a class="navbar-brand"> <img src="../static/logo.jpeg" width="100	" height="100" alt=""></a>
            <h1 style="color:white">The Question</h1>
            <div id="auth">
                <#if !authentication??>
                    <form class="form-inline">
                        <button class="btn btn-outline-dark btn-sm" type="button"><a href="/signUp">Sign up</a></button>
                        <button class="btn btn-outline-dark btn-sm" type="button"><a href="/signIn">Log In</a></button>
                    </form>
                </#if>
                <#if authentication??>
                    <#if authentication.isAuthenticated()>
                        <form class="form-inline">
                            <button class="btn btn-outline-dark btn-sm" type="button"><a href="/logout">Log Out</a></button>
                        </form>
                    </#if>
                </#if>
            </div>
        </nav>
    </div>
    <div class="main">
        <div id="navigation" align="left">
            Navigation:
            <ul>
                <li> <a href="/questions" target="_blank">Questions list</a></li>
                <li> <a href="/questions/new-question" target="_blank">Add question</a></li>
                <li><a href="/tags">Tags</a></li>
            </ul>
        </div>
        <div id="main">
            <a  class="title">Hello, here you can find actual questions and answers on them. Come here and join us.
                <li>Rules:<ul>Don't be rude</ul><ul>just write your questions</ul><ul>just write your answer on question</ul><ul>It is too simply</ul><ul>or simple, sorry I dont know how to write correctly... or correct</ul></li>
                If you so cocky, and you allow to break the rules for yourself, we'll ban you
            </a>
        </div>

        <div id="Author">
            <h2>Where find<abbr title="Shamil Abdullin"> the author</abbr></h2>
            <p><a href="https://vk.com/id63962052" target="_blank" class="href">VK</a></p>
            <p ><a href="https://www.instagram.com/we._.fucking._.lost/" class="href">Instagram</a></p>
            <address class="address">Russia,Tatarstan,Kazan</address>
        </div>
    </div>
    </body>
</html>