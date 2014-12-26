<%@page import="org.apache.jasper.tagplugins.jstl.core.Param"%>
<%@page import="fr.upem.m2.tw.mlvbooks.objects.beans.BookList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style/design.css" media="screen" />
        <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
        <script type="text/javascript" src="script/tablesorter/jquery.tablesorter.js"></script>
        <script type="text/javascript" src="script/script.js"></script>
        <title>MLV Books</title>
    </head>
    <body>
        <section>
            
        </section>
        <section id="searchSection">
           <form action="BookSearchServlet" method="GET">
                <input id="main-search-input" name="all-criteria" placeholder="Title, author, ISBN..." value="" />&nbsp;
                <span onclick="displayHiddenSearchFields()" id="advanced-search-toggler">advanced search...</span><br/>
                <div id="hidden-search">
                    <input name="title" placeholder="Title" value="" /><br/>
                    <input name="author" placeholder="Author" value="" /><br/>
                    <input name="isbn" placeholder="ISBN" value="" /><br/>
                    <input class="price-range" name="starting-price" value="0" /> - <input class="price-range" name="ending-price" value="" /> €<br/>
                </div>
                <div id="action-zone">
                    <button type="Reset">Clear</button>
                    <button value="Submit">Search</button>
                </div>
            </form>
        </section>
        <section id="resultSection">
            <c:set var="books" value="${requestScope.books}"/>
            <c:if test="${books != null}">
                <hr class="separative-lign"/>
                <table id="search-result-table" class="tablesorter">
                    <THEAD>
                        <tr>
                            <th>Title</th>
                            <th>Author</th>
                            <th>Price (€)</th>
                        </tr>
                    </THEAD>
                    <TBODY>
                        <c:forEach var="book" items="${books}">
                            <tr>
                                <td><c:out value="${book.getTitle()}"/></td>
                                <td><c:out value="${book.getAuthor()}"/></td>
                                <td><c:out value="${book.getPrice()}"/></td>
                            </tr>
                        </c:forEach>
                    </TBODY>
                </table>
            </c:if>
        </section>
    </body>
</html>