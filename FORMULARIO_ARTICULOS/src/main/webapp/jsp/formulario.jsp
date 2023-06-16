<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>formulario</title>
</head>
<body>
<form action="Servlet_Formulario" method="post">
		<table>
			<tr>
				<td>ARTÍCULO</td>
				<td><input type="number" name="codigo_articulo"></td>
			</tr>
			<tr>
				<td>DESCRIPCIÓN</td>
				<td><input type="text" name="descripcion_articulo"></td>
			</tr>
			<tr>
				<td>PRECIO</td>
				<td><input type="number" name="precio_articulo"></td>
			</tr>
			<tr>
				<td>UNIDADES</td>
				<td><input type="number" name="unidades_articulo"></td>
			</tr>
			<tr>
				<td><input type="submit" name="accion" value="alta"></td>
				<td><input type="submit" name="accion" value="baja"></td>
			</tr>
			<tr>
				<td><input type="submit" name="accion" value="modificar"></td>	
				<td><input type="submit" name="accion" value="consultar"></td>
			</tr>
		</table>
	</form>
</body>
</html>
