function valid(form) {
    var fail = false;
    var email = form.email.value;
    var pass = form.password.value;
    if (email === '') {
        fail = "Enter your  email";
    } else if (pass === '' || pass === ' ') {
        fail = "Enter your password";
    }
    if (fail) {
        alert(fail);
    }
}