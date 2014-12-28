$(document).ready(
	function() { 
		$("table").tablesorter();
		if (sessionStorage.books) {
			var books = getBooksFromSessionStorage();
			updateHiddenFieldValue(books);
			updateCartCounter("" + books.length);
			if (books.length == 0) {
				$("#cart-display-button").attr("disabled", "disabled");
			} else {
				$("#cart-display-button").removeAttr("disabled");
			}
		} else {
			$("#cart-display-button").attr("disabled", "disabled");
		}
	} 
); 

function addToCart(id, title) {
	var books = new Array();
	if (!sessionStorage.books) {
		books[0] = id;
		$("#book-ids-field").attr("value", JSON.stringify(books));
		updateCartCounter("1");
		$("#cart-display-button").removeAttr("disabled");
	} else {
		books = getBooksFromSessionStorage();
		books[books.length] = id;
		updateHiddenFieldValue(books);
		updateCartCounter(parseInt($("#cart-size").text()) + 1);
	}
	updateSessionStorage(books);
	alert("The book " + title + " is added to your cart.");
}

function removeFromCart(id, title) {
	if (sessionStorage.books) {
		var books = getBooksFromSessionStorage();
		var index = books.indexOf(id);
		if (index > -1) {
			books.splice(index, 1);
			updateBooks(books);
			alert("The book " + title + " is now removed from your cart.");
		}
	}
}

function clearCart() {
	if (sessionStorage.books) {
		var emptyArray = new Array();
		updateBooks(emptyArray);
		alert("The cart is now emptied.");
	}
}

function updateBooks(books) {
	updateSessionStorage(books);
	updateHiddenFieldValue(books);
	updateCartCounter("" + books.length);
	displayHiddenSearchFields();
}

function getBooksFromSessionStorage() {
	return JSON.parse(sessionStorage.getItem("books"));
}

function updateSessionStorage(books) {
	sessionStorage.setItem("books", JSON.stringify(books));
}

function updateHiddenFieldValue(books) {
	$("#book-ids-field").attr("value", JSON.stringify(books));
}

function updateCartCounter(string){
	$("#cart-size").text(string);
}

function displayHiddenSearchFields() {
	$("#hidden-search").toggle();
	var toggler = $("#advanced-search-toggler");
	if (toggler.hasClass("disabled")) {
		toggler.removeClass("disabled").addClass("enabled");
		toggler.text("simple search...");
	} else {
		toggler.removeClass("enabled").addClass("disabled");
		toggler.text("advanced search...");
	}
}