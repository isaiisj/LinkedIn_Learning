var request = new XMLHttpRequest();

request.open('GET', 'https://hplussport.com/api/products?order=name');

request.onload = function() {
	for(item in jsonData) {
		
		//Display all the product names
		var productName = jsonData[item].name;
		var products = document.createElement('li');
		products.innerHTML = productName;
		document.body.appendChild(products);

		//Display all the product images
		var productImg = jsonData[item].image;
		var images = document.createElement('img');
		images.setAttribute('src', productImg);
		document.body.appendChild(images);

	}

	
};

request.send();
