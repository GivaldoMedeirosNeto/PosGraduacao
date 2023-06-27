<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>LivrosWeb</title>
	</head>
	<body>
		<form action="login" method="post">
			<table>
				<tr>
					<td>Usuário</td>
					<td><input type="text" name="usuario" size="20"></td>
				</tr>
				<tr>
					<td>Senha</td>
					<td><input type="password" name="senha" size="20"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Validar"></td>
				</tr>
			</table>			
		</form>
	</body>
</html>