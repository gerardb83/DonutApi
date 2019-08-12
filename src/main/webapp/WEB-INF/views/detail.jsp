<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Donut Land</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/spacelab/bootstrap.min.css"
	rel="stylesheet" crossorigin="anonymous">
<link href="/styles.css" rel="stylesheet" />
</head>
<body>
	<div class="container">
		<h1>${donut.name}</h1>
		<img src="${donut.photo}" />

		<div>
			<table>
				<tr>
					<td>Calories:</td>
					<td>${donut.calories}</td>
				</tr>
				<tr>
					<td><h6>Extras:</h6></td>
				</tr>
				<c:forEach var="each" items="${donut.extras}">
					<tr>
						<td>${each}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<br><br><a class="btn btn-primary" href="/">Home</a>
	</div>
</body>
</html>