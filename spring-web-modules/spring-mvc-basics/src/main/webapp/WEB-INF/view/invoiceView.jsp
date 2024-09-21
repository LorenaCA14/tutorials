<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
			<td>${cantidad - (porcentajeRetencion * 0.01)}
		</tr>
	</table>
</body>
</html>