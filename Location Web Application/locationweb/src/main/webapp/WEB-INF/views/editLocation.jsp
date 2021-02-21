<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.4.1/semantic.min.css"
	integrity="sha512-8bHTC73gkZ7rZ7vpqUQThUDhqcNFyYi2xgDgPDHc+GXVGHXq+xPjynxIopALmOPqzo9JZj0k6OqqewdGO3EsrQ=="
	crossorigin="anonymous" />
<title>Edit Location</title>
</head>
<body>
<form action="updateLoc" method="post" class="ui form">
		<div class="ui main container">
			<h2 class="ui dividing header">Update Location Information</h2>
			<div class="field">
				<div class="field">
					<label>Id</label> <input type="text" name="id" placeholder="Id" value="${location.id}" readonly>
				</div>

				<div class="field">
					<label>Code</label> <input type="text" name="code"
						placeholder="Code" value="${location.code}">
				</div>

				<div class="field">
					<label>Name</label> <input type="text" name="name"
						placeholder="Name" value="${location.name}">
				</div>

				<div class="grouped fields">
					<label>Type</label>
					<div class="field">
						<div class="ui radio checkbox">
							<input type="radio" name="type" value="URBAN" ${location.type=='URBAN'?'checked':''}> <label>Urban</label>
						</div>
					</div>
					<div class="field">
						<div class="ui radio checkbox">
							<input type="radio" name="type" value="RURAL" ${location.type=='RURAL'?'checked':''}> <label>Rural</label>
						</div>
					</div>
				</div>

				<button class="ui primary button" type="submit">Save</button>
			</div>
		</div>
	</form>
</body>
</html>