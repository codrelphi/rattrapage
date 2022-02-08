<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Affichage de nom</title>
</head>
<body>
	<form method="post" action="<%= request.getContextPath()%>/nom">
		<p>
			<label for="inputNom">Votre nom : </label>
			<input type="text" id="inputNom" name="nom">
			<input type="submit" value="envoyer">
		</p>
	</form>
	
	<c:if test="${!empty resultat }">
		<p>Votre nom: ${resultat }</p>
	</c:if>
</body>
</html>