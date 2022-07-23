<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List"%>
<%@ page import="com.model.gettersetter"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<style>
.alignleft {
	text-align: center;
	margin-top: 20px;
}

.alignright {
	text-align: right;
	margin-right: 50px;
}
</style>
</head>
<body>
	<div id="textbox">
		<h5 class="alignleft">
			<b>Products for the customer </b>
		</h5>
		<p class="alignright">
			Hi Username &nbsp; <input class="alignright" type="submit"
				value="Logout" />
		</p>
	</div>
	<br>
	<div style="margin-left: 80px;">
		<form action="<%=request.getContextPath()%>/Search" method="get">
			<table>
				<h6>Please enter your product choice</h6>
				<tr>
					<td>colour</td>
					<td><input type="text" name="title" required /></td>
				</tr>

				<tr style="margin-top: 50px;">
					<td>Size</td>
					<td><input type="text" name="size" required /></td>
				</tr>
				<tr>
					<td>gender</td>
					<td><label><input name="gender" type="radio"
							value="m" required style="margin: 0px; float: none;"> 
							Male </label>
							 <label><input name="gender" type="radio"
							value="f" required style="margin: 0px; float: none;"> 
						   Female </label> </td>
				</tr>
				<tr>
					<td>Output<br> preference
					</td>
					<td><label><input name="outputPreference" type="radio"
							value="price" required style="margin: 0px; float: none;"> By
							Price </label>
							 <label><input name="outputPreference" type="radio"
							value="rating" required style="margin: 0px; float: none;"> By
							Rating </label> <br>
							<input type="submit" >
					<br></td>
				</tr>
			</table>
		</form>
	</div>
	<br>
	<br>
	<div class="container">

		<table class="table table-bordered">
			<thead>
				<tr>
					<th>S.No</th>
					<th>Name</th>
					<th>color</th>
					<th>Size</th>
					<th>gender</th>
					<th>price</th>
					<th>Available</th>
					<th>Rating</th>
				</tr>
			</thead>
			
<c:forEach var="listuser" items="${user}">
<tr>
<td>${listuser.id}</td>
<td>${listuser.name}</td>
<td>${listuser.colour}</td>
<td>${listuser.size}</td>
<td>${listuser.gender}</td>
<td>${listuser.price}</td>
<td>${listuser.rating}</td>
<td>${listuser.available}</td>
</tr>
</c:forEach>

			
			
		</table>
	</div>
	


</body>
</html>