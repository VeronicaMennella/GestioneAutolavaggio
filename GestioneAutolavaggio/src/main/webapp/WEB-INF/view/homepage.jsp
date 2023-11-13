<%@page import="it.rf.autolavaggio.model.Utente"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%
Utente u =(Utente) request.getAttribute("oggetto-utente");
Utente u2 =(Utente) session.getAttribute("oggetto-sessione");
%>
</head>
<body>
<p>
	l'utente inserito è <%=(u != null) ? u.getUsername() + " " + u.getPassword() : "null" %>
</p>
<p>
	l'utente inserito è <%= u2.getUsername() + " " + u.getPassword() %>
</p>


</body>
</html>