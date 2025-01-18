fetch('https://hplussport.com/api/products?order=name')
.then(function(response) {
	return response.json();
})
.then(function(jsonData) {
	console.log(jsonData)

	for(item in jsonData) {
		
		//Display all the product names
		var productName = jsonData[item].name;
		var product = document.createElement('li');
		product.innerHTML = productName;
		document.body.appendChild(product);

		//Display all the product images
		var productImg = jsonData[item].image;
		var imageEl = document.createElement('img');
		imageEl.setAttribute('src', productImg);
		document.body.appendChild(imageEl);

	}

})
