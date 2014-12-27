$(document).ready(
	function() { 
		$("table").tablesorter();
		if (sessionStorage.books) {
			var books = JSON.parse(sessionStorage.getItem("books"));
			$("#book-ids-field").attr("value", JSON.stringify(books));
			$("#cart-size").text("" + books.length);
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
	if (!sessionStorage.books) {
		var books = new Array();
		books[0] = id;
		sessionStorage.setItem("books", JSON.stringify(books));
		$("#book-ids-field").attr("value", JSON.stringify(books));
		$("#cart-size").text("1");
		$("#cart-display-button").removeAttr("disabled");
	} else {
		var books = JSON.parse(sessionStorage.getItem("books"));
		books[books.length] = id;
		sessionStorage.setItem("books", JSON.stringify(books));
		$("#book-ids-field").attr("value", JSON.stringify(books));
		$("#cart-size").text(parseInt($("#cart-size").text()) + 1);
	}
	alert("The book " + title + " is added to your cart.");
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