<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
<title>Spring MVC Form Handling</title>
</head>
<body>

	<h2>Submitted Invoice Information</h2>
	<h3>${msg}</h3>
	<table>
		<tr>
			<td>Concept :</td>
			<td>${concepto}</td>
		</tr>
		<tr>
			<td>ID :</td>
			<td>${id}</td>
		</tr>
		<tr>
			<td>Quantity :</td>
			<td><fmt:formatNumber value="${cantidad - (cantidad * porcentajeRetencion * 0.01)}" maxFractionDigits="2"/>
		</tr>
	</table>
</body>
</html>
