const test = () => {

    fetch('http://localhost:8080/regal', {
        method: 'GET'
    }).then(result => {
        result.json();
    }).then(json => {
        console.log(json);
    });
};