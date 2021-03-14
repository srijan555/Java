<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Weather Application</title>
<style type="text/css">
#d {
	margin-top: 25px;
}
</style>
</head>
<body>
	<%@include file="header.jsp"%>
	<div id="d">
		<form action="showLatiLong">
			Enter Location: <input type="text" name="location" /> <input
				type="submit" value="Search"><br>
		</form>
		<%-- ${load}<br>
			Place: ${loc.features[0].place_name}<br>
			Longitude: ${loc.features[0].center[0]}<br>
			Latitude: ${loc.features[0].center[1]}<br>
			Climate: ${mj.currently.summary}<br>
			Temperature: ${mj.currently.temperature}<br> --%>
		${msg}
	</div>
</body>
</html>