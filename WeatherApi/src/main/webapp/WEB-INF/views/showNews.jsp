<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">


<head>
<title>News</title>
</head>
<body>
<%@include file="header.jsp" %>

	<c:forEach var="i" begin="0" end="20">
		<h2>${news.articles[i].title}</h2>
		${news.articles[i].description}<br>
		<br>
		<a href="${news.articles[i].url}">${news.articles[i].url}</a>
		<br>
		<br>
		<img alt="${news.articles[i].urlToImage}" src="${news.articles[i].urlToImage}" height="250" width="380">
		<br>
		<br>
		${news.articles[i].content}<br>
		<br>
		<br>
	</c:forEach>
</body>
</html>