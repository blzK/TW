<%@page import="fr.upem.m2.tw.mlvbooks.objects.beans.HeavyBook"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <c:set var="book" value="${requestScope.book}"/>
    <c:if test="${book == null}">
        <c:redirect url="index.jsp"/>
    </c:if>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title></title>
	</head>
	<body>
	
	</body>
</html>