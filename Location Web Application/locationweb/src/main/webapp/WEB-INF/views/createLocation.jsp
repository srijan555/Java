<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.4.1/semantic.min.css"
	integrity="sha512-8bHTC73gkZ7rZ7vpqUQThUDhqcNFyYi2xgDgPDHc+GXVGHXq+xPjynxIopALmOPqzo9JZj0k6OqqewdGO3EsrQ=="
	crossorigin="anonymous" />
<title>Create Location</title>
</head>
<body>
	<form action="saveLoc" method="post" class="ui form">
		<div class="ui main container">
			<h2 class="ui dividing header">Location Information</h2>
			<div class="field">
				<div class="field">
					<label>Id</label> <input type="text" name="id" placeholder="Id"
						required>
				</div>

				<div class="field">
					<label>Code</label> <input type="text" name="code"
						placeholder="Code" required>
				</div>

				<div class="field">
					<label>Name</label> <input type="text" name="name"
						placeholder="Name" required>
				</div>

				<div class="grouped fields">
					<label>Type</label>
					<div class="field">
						<div class="ui radio checkbox">
							<input type="radio" name="type" value="URBAN"> <label>Urban</label>
						</div>
					</div>
					<div class="field">
						<div class="ui radio checkbox">
							<input type="radio" name="type" value="RURAL"> <label>Rural</label>
						</div>
					</div>
				</div>

				<button class="ui primary button" type="submit"
					onclick="myFunction()">Save</button>
			</div>
			<a class="ui teal tag label" href="displayLocations">View All</a>
		</div>
	</form>
	<div class="ui sizer vertical segment">
		<div class="ui dividing header">${msg}</div>
	</div>
</body>
</html>