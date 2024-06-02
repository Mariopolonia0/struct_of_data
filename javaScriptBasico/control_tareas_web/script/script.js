function login() {

    const uri = 'http://www.apinomina.somee.com/api/Books';

    fetch(uri)
        .then(response => console.log(response.json()))
        .then(data => console.log(data))
        .catch(error => console.error('Unable to get items.', error));
}
