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

		<h1>Donut Land</h1>

			<table class="table">
			<thead>
				<tr>
					<th>Donuts We Offer</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="each" items="${results}">
					<tr>
						<td><a href="/detail?id=${each.id}">${each.name}</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>