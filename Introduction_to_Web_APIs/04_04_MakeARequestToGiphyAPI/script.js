fetch('https://api.giphy.com/v1/gifs/random?api_key=UqRt38OK6F6O4OphqsZOdkKZDJZ5LNqV')
.then(function(response) {
	return response.json();
})
.then(function(jsonData) {
	console.log(jsonData);
})
