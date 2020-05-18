function valid(form){
    var fail = false;
    var email = form.email.value;
    var pass = form.password.value;
    var checkbox = form.checkbox.value;
    console.log(checkbox)
    if (email==='') {
        fail="Enter your  email";
    }
    else if (pass===''||pass===' ') {
        fail="Enter your password";
    }
    if (fail) {
        alert(fail);
    }
}