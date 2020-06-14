<html>
    <head>
        <title>The_Question</title>
        <meta charset="utf-8">
        <link rel="stylesheet" href="../static/Mainpage.css">
        <link rel="stylesheet" href="../static/footer.css">
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
        <div id="main">
            <h2 class="title">Умные ответы на ваши гениальные вопросы!</h2>
            <p> </p>
        </div>
        <div id="main">
            <h5 class="title">Навигация: </h5>
            <ul class="title">
                <li> <a href="/questions" target="_blank"><b>Список вопросов</b></a></li>
                <li> <a href="/questions/new-question" target="_blank"><b>Добавить вопрос</b></a></li>
                <li> <a href="/tags"><b>Тэги</b></a></li>
            </ul>
            <p> </p>
        </div>
        <div id="main">
            <h5 class="title">КАК РАБОТАЕТ СЕРВИС THEQUESTION?</h5>
            <h5 class="title">Найдем ответы на все вопросы</h5>
            <p class="title">TheQuestion связывает тех, кто может задать интересный вопрос, с теми, кто готов дать ответ и помочь разобраться. Мы строим открытое сообщество людей, которые готовы критически осмысливать окружающую действительность, помогать друг другу, делиться разными взглядами, подвергать сомнению свои собственные убеждения, узнавать новое и меняться к лучшему. Каждый человек может задать вопрос, мы находим тех, кто даст самый лучший ответ. Мы ищем людей, которые вдохновляют. Мы хотим, чтобы каждый человек мог познакомиться с тем, кто вдохновляет, вызывает любопытство к жизни и открывает новые возможности для развития.
                Приходите к нам чтобы задать свой вопрос или написать ответ на один из тех, на который у вас есть свое мнение.
            </p>

        </div>
    </div>
    <div class="footer">
        <div id="Author">
            <h2 align="center" style="color:white">The Question </h2>
            <h5 align="center" style="color:white">@ 2020 TheQuestion</h5>
            <p align="center"><a href="https://vk.com/id63962052" target="_blank" class="href">VK   </a><a href="https://www.instagram.com/we._.fucking._.lost/" class="href">Instagram    </a></p>
        </div>
    </div>
    </body>
</html>