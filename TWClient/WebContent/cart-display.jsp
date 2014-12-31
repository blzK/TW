<%@page import="fr.upem.m2.tw.mlvbooks.objects.beans.LightBook"%>
<%@page import="fr.upem.m2.tw.mlvbooks.objects.beans.Cart"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
	    <link rel="stylesheet" type="text/css" href="style/design.css" media="screen" />
        <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
        <script type="text/javascript" src="script/tablesorter/jquery.tablesorter.js"></script>
        <script type="text/javascript" src="script/cart-display-script.js"></script>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>MLV Books</title>
	</head>
	<body>
	   <section>
	       <c:set var="accountBalance" value="${requestScope.accountBalance}"/>
	       <c:if test="${accountBalance != null}">
	           <c:out value="Account balance: ${accountBalance} €" />
	       </c:if>
	   </section>
	   <section id="cart-display-section">
	       <c:set var="cart" value="${requestScope.cart}"/>
	       <c:if test="${cart != null}">
	           <table>
	               <tr>
	                   <th>Title</th>
	                   <th>Author</th>
	                   <th>Price (€)</th>
	                   <th>Quantity</th>
	               </tr>
		           <c:set var="entrySet" value="${cart.entrySet()}"/>
		           <c:forEach items="${cart.entrySet().iterator()}" var="entry">
		              <tr>
		                  <td><c:out value="${entry.getKey().title}" /></td>
		                  <td><c:out value="${entry.getKey().author}" /></td>
		                  <td><c:out value="${entry.getKey().price}" /></td>
		                  <td><c:out value="${entry.getValue()}" /></td>
		              </tr>
		           </c:forEach>
	           </table>
	           <c:set var="cost" value="${cart.getTotalPrice()}"/>
	           <c:out value="Total: ${cost}€"/><br/>
	           <div>
		           <button id="clearCartButton" onclick="clearCartAndAlert(); redirect();">Clear cart</button>
	               <form method="POST" action="BuyingServlet">
	                   <input type="hidden" name="cost" value="${cost}" />
	                   <button id="buyButton" onclick="clearCart()" value="Submit">Buy</button>
	               </form>
	           </div>
	       </c:if>
	   </section>
	</body>
</html>