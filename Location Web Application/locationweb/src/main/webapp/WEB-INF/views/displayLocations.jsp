<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.4.1/semantic.min.css"
	integrity="sha512-8bHTC73gkZ7rZ7vpqUQThUDhqcNFyYi2xgDgPDHc+GXVGHXq+xPjynxIopALmOPqzo9JZj0k6OqqewdGO3EsrQ=="
	crossorigin="anonymous" />
<title>Display Locations</title>
</head>
<body>
	<div class="ui main container">
		<h2 class="ui dividing header">Location Information</h2>

		<table class="ui celled table">
			<thead>
				<tr>
					<th>ID</th>
					<th>CODE</th>
					<th>NAME</th>
					<th>TYPE</th>
					<th>DELETE</th>
					<th>UPDATE</th>
				</tr>
			</thead>
			<c:forEach items="${locations}" var="location">
				<tr>
					<td data-label="ID">${location.id}</td>
					<td data-label="CODE">${location.code}</td>
					<td data-label="NAME">${location.name}</td>
					<td data-label="TYPE">${location.type}</td>
					<td data-label="DELETE"><a
						href="deleteLocation?id=${location.id}">delete</a></td>
					<td data-label="UPDATE"><a href="showUpdate?id=${location.id}">update</a></td>
				</tr>
			</c:forEach>
		</table>
		<div class="ui divided selection list">
		<a class="ui teal tag label" href="showCreate">Add Location</a> 
		<a class="ui red tag label" href="generateReport">Generate Report</a>
		</div>
	</div>
</body>
</html>