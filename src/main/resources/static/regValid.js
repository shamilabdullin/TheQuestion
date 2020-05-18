function valid(form){
    var fail = false;
    var email = form.email.value;
    var pass = form.password.value;
    var date = form.date.value;
    if (email==='') {
        fail="Введите свой email";
    }
    else if (pass==='') {
        fail="Придумайте пароль";
    }
    else if (date===''){
        fail="Put birthday";
    }
    if (fail) {
        alert(fail);
    }
}