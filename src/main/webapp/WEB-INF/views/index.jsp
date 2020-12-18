<%@ page language="java" contentType="text/html;
charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;
charset=ISO-8859-1">
<title>Store Manager</title>
</head>
<body>
	<div align="center">
		<h2>Store Manager</h2>
		<form method="get" action="search">
			<input type="text" name="keyword" /> &nbsp; <input type="submit"
				value="Search" />
		</form>
		<h3>
			<a href="new">New Store</a>
		</h3>
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
			<c:forEach items="${listStore}" var="store">
				<tr>
					<td>${store.id}</td>
					<td>${store.name}</td>
					<td>${store.address}</td>
					<td>${store.email}</td>
					<td>${store.contact}</td>
					<td>${store.status}</td>
					<td><a href="edit?id=${store.id}">Edit</a> &nbsp;&nbsp;&nbsp;
						<a href="delete?id=${store.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>