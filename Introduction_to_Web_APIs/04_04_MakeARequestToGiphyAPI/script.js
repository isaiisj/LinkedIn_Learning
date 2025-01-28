fetch('https://api.giphy.com/v1/gifs/random?api_key=XXXXXXXXXXXXXXXXXXXXX')
.then(function(response) {
	return response.json();
})
.then(function(jsonData) {
	console.log(jsonData);
})
