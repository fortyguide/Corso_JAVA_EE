<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*, java.io.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset-ISO-8859-1">
        <title>Format</title>
    </head>
<body>
    <% //http://localhost:8080/Corso_JAVA_EE/tag_library/jstl/format.jsp %>

    <fmt:formatNumber
        var="numero"
        value="1000.45677"
        type="CURRENCY"
        maxFractionDigits="2"
        minFractionDigits="2"
        pattern="###.##">
    </fmt:formatNumber>
    <p> Valore formattato ${numero}</p>

    <%
        Calendar c = new GregorianCalendar();
        c.set(Calendar.YEAR, 2017);
        c.set(Calendar.MONTH, 9);
        c.set(Calendar.DATE, 28);

        request.setAttribute("dataCorrente", c.getTime());
    %>
    <fmt:formatDate
        value="${requestScope.dataCorrente}"
        pattern="d/M/y"
        var="data"/>
    <p> Data formattata ${data}</p>

</body>
</html>