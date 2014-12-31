$(document).ready(
	function() { 
		$("#hidden-ids").attr("value", sessionStorage.getItem("books"));
	} 
);

/**
 * Clears the cart.
 */
function clearCart() {
	if (sessionStorage.books) {
		sessionStorage.removeItem("books");
	}
}

/**
 * Clears the cart and alerts the user.
 */
function clearCartAndAlert() {
	clearCart();
	alert("The cart is now emptied.");
	location.reload();
}

function redirect() {
	window.location.replace("index.jsp");
}