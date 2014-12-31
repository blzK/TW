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

/**
 * Clears the cart and alerts the user.
 */
function clearCartAndAlert() {
	clearCart();
	$("#cart-display-button").attr("disabled", "disabled");
	alert("The cart is now emptied.");
	location.reload();
}

/**
 * Adds a book to the cart.
 * @param id the book's id.
 * @param title the books's title.
 */
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

/**
 * Removes a book from the cart.
 * @param id the book's id.
 * @param title the book's title.
 */
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

/**
 * Clears the cart.
 */
function clearCart() {
	if (sessionStorage.books) {
		sessionStorage.removeItem("books");
	}
}

/**
 * Updates the books in the session storage, the hidden field value, the cart
 * counter and toggles the "display cart" button.
 * @param books the new books.
 */
function updateBooks(books) {
	updateSessionStorage(books);
	updateHiddenFieldValue(books);
	updateCartCounter("" + books.length);
}

/**
 * Gets the books from the session storage.
 * @returns the books.
 */
function getBooksFromSessionStorage() {
	return JSON.parse(sessionStorage.getItem("books"));
}

/**
 * Updates the session storage with the new books.
 * @param books the new books.
 */
function updateSessionStorage(books) {
	sessionStorage.setItem("books", JSON.stringify(books));
}

/**
 * Updates the hidden field value.
 * @param books the value (array) to be converted to string.
 */
function updateHiddenFieldValue(books) {
	$("#book-ids-field").attr("value", JSON.stringify(books));
}

/**
 * Updates the cart counter.
 * @param string the new value.
 */
function updateCartCounter(string){
	$("#cart-size").text(string);
}

function goToDetailPage(id) {
	window.location.replace("BookDetailsServlet?id=" + id);
}