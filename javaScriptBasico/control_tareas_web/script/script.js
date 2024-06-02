function login() {

    const uri = 'http://www.apinomina.somee.com/api/Books';
    fetch(uri, {
        headers: {
            'origin':'https://mariopolonia0.github.io/struct_of_data/javaScriptBasico/control_tareas_web/index.html',
            'Access-Control-Allow-Origin': 'http://www.apinomina.somee.com/api/Books' 
        }
    })
        .then(response => console.log(response.json()))
        .then(data => document.getElementById("username").value = data)
        .catch(error => document.getElementById("username").value = error);






    /* headers.append('Access-Control-Allow-Origin', 'http://localhost:3000');
     headers.append('Access-Control-Allow-Credentials', 'true');
 
     headers.append('GET', 'POST', 'OPTIONS');
 
     headers.append('Authorization', 'Basic ' + base64.encode(username + ":" + password));
 
     fetch(sign_in, {
         //mode: 'no-cors',
         credentials: 'include',
         method: 'POST',
         headers: headers
     })
         .then(response => response.json())
         .then(json => console.log(json))
         .catch(error => console.log('Authorization failed : ' + error.message));
 
     */
}