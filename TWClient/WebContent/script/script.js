$(document).ready(
	function() { 
		$("table").tablesorter(); 
	} 
); 


function addToCart(id, title) {
	if (!sessionStorage.books) {
		var books = new Array();
		books[0] = id;
		sessionStorage.setItem("books", JSON.stringify(books));
	} else {
		var storedBooks = JSON.parse(sessionStorage.getItem("books"));
		storedBooks[length] = id;
		sessionStorage.setItem("books", JSON.stringify(storedBooks));
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