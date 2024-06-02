function login() {

    //const uri = 'https://controltarea.azurewebsites.net/api/Books';
    //https://localhost:7086/api/Books

    const uri = 'http://www.apinomina.somee.com/api/Books';

    fetch(uri)
        .then(response => alert(response.text)  )
        .then(text => document.getElementById("username").value = text)
        .catch(error => document.getElementById("username").value = error);

}