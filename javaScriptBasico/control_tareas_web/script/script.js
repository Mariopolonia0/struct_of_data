function login() {

    //const uri = 'https://controltarea.azurewebsites.net/api/Books';
    //https://localhost:7086/api/Books

    const uri = 'http://www.apinomina.somee.com/api/Books';

    fetch(uri)
        .then(response => console.log(response.json()))
        .then(data => document.getElementById("username").value = data)
        .catch(error => document.getElementById("username").value = error);

}