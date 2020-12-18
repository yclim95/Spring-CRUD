<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Result</title>
</head>
<body>
	<div align="center">
		<h2>Search Result</h2>
		<table border="1" cellpadding="5">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Address</th>
				<th>E-mail</th>
				<th>Contact</th>
				<th>Status</th>
				<th>Action</th>
			</tr>
			<c:forEach items="${result}" var="store">
				<tr>
					<td>${store.id}</td>
					<td>${store.name}</td>
					<td>${store.address}</td>
					<td>${store.email}</td>
					<td>${store.contact}</td>
					<td>${store.status}</td>
				</tr>
			</c:forEach>
		</table>
		<button onclick="goBack()">Go Back</button>

		<script>
			function goBack() {
				window.history.back();
			}
		</script>
	</div>
</body>
</html>