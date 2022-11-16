<%@ page import="java.util.*, java.io.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset-ISO-8859-1">
        <title>Core</title>
    </head>
<body>
    <% //http://localhost:8080/Corso_JAVA_EE/tag_library/jstl/core.jsp %>

    <c:if test="${param.test1 == null && param.test2 == null}">
       I parametri test1 e test2 non hanno alcun valore nella request
    </c:if><br>
    <c:if test="${param.test1 == null}">
       Il parametro test1 non ha alcun valore nella request
    </c:if><br>
    <c:if test="${param.test2 == null}">
        Il parametro test2 non ha alcun valore nella request
    </c:if><br>

    <% //Le due righe di stampa seguenti sono equivalenti: %> <br>
    <c:out value="<%=request.getParameter(\"test1\") %>" default="ECCO!"></c:out> <br>
    <c:out value="${param.test2}" default="RIECCO!"></c:out> <br>

    <c:set var="prova" value="1234" scope="request"></c:set>
    <c:out value="${prova}" default="RIECCOLO!"></c:out> <br>
    <% /*È possibile stampare il valore di una variabile
         anche direttamente tra tag HTML, nel seguente modo: */%>
    <h2>${prova}</h2>

    <c:choose>
        <c:when test="${param.test1 == null && param.test2 == null}">
            I parametri test1 e test2 non hanno alcun valore nella request (sono nello switch case)
        </c:when>
        <c:when test="${param.test1 == null}">
            Il parametro test1 non ha alcun valore nella request (sono nello switch case)
        </c:when>
        <c:when test="${param.test2 == null}">
            Il parametro test2 non ha alcun valore nella request (sono nello switch case)
        </c:when>
        <c:otherwise>
            Nessuna condizione dello switch case si e' verificata!
        </c:otherwise>
    </c:choose> <br>
    <br>

    <%
        List<String> lista = new ArrayList<String>();
        lista.add("Valore 1");
        lista.add("Valore 2");
        lista.add("Valore 3");
        lista.add("Valore 4");
        lista.add("Valore 5");

        request.setAttribute("elementi", lista);

        /*
            requestScope.NOMEATTRIBUTO è l'equivalente di request.getAttribute("NOMEATTRIBUTO")
            sessionScope.NOMEATTRIBUTO è l'equivalente di session.getAttribute("NOMEATTRIBUTO")
            param.NOMEPARAMETRO è l'equivalente di request.getParameter("NOMEATTRIBUTO")
        */
    %>
    <c:forEach items="${requestScope.elementi}" var="elemento" varStatus="contatore">
        ${elemento}<br>
    </c:forEach>

    <c:forTokens items="1,2,3,4,5" delims="," var="numero" varStatus="contatore">
        ${numero}
    </c:forTokens>

</body>
</html>