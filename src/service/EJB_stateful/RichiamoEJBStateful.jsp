<%@ page import="java.util.*, java.io.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset-ISO-8859-1">
        <title>Richiamo EJB Stateful</title>
    </head>
<body>
    <c:set var="contatoreIncrementatoDaEJB" value="${requestScope.contatore}" scope="request"></c:set>
    <c:out value="${requestScope.contatore}" default="Non è arrivato nessun contatore!"></c:out> <br>
</body>
</html>