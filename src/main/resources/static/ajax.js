function update(){
    window.addEventListener("load",function()  {
        let questions = new Array();
        const request = new XMLHttpRequest();
        const url = "/questions";
        request.open('GET', url);

        request.setRequestHeader('Content-Type', 'application/json');

        request.addEventListener("readystatechange", () => {
            if (request.readyState === 4 && request.status === 200) {
            console.log(request.responseText);
        }
    });
        request.send();
    });}