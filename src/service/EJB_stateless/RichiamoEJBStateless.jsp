<%@ page import="java.util.*, java.io.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset-ISO-8859-1">
        <title>Richiamo EJB Stateless</title>
    </head>
<body>
    <c:set var="salutoArrivatoDaEJB" value="${requestScope.salutoEJB}" scope="request"></c:set>
    <c:out value="${requestScope.salutoArrivatoDaEJB}" default="Non è arrivato nessun saluto!"></c:out> <br>
</body>
</html>