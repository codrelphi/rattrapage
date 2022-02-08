<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Affichage de nom avec AJAX</title>
<style>

	#resultat {
		color: green;
	}
</style>
</head>
<body>
	<form name="nomForm" method="post" action="<%= request.getContextPath()%>/nomajax">
		<p>
			<label for="inputNom">Votre nom : </label>
			<input type="text" id="inputNom" name="nom">
			<input type="button" value="envoyer" onclick="afficherNomAjax()">
		</p>
	</form>
	
	<p id="resultat"></p>
	
	
	
	<script>
		
		function afficherNomAjax() {
			
			var nom = document.nomForm.nom.value;

			var xhr = new XMLHttpRequest();
			var url = "/TestAjaxFarid/nomajax?nom=" + nom;
			var method = "POST";
			
			try {
				xhr.open(method, url, false); // false= synchrone; true=asynchrone
				xhr.send();
				
				if (xhr.readyState == 4 && xhr.status == 200) {
					var reponse = xhr.responseText;
					document.getElementById("resultat").innerHTML = reponse;
				}
				else {
					console.log("Chargement...");
				}
			}
			catch(e) {
				alert("Impossible de contacter le serveur...");
			}
			
			
			//alert("Votre nom: " + nom);
			
			
			
		}
		
		
	
	</script>
	
</body>
</html>