<%@ page import="java.util.*, java.io.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset-ISO-8859-1">
        <title>Carrello</title>
    </head>
<body>
    <h1>Carrello</h1>

         <%
            List<String> carrello = (List<String>) request.getSession().getAttribute("carrello");

            if(carrello != null && carrello.size() > 0) {
                for(String articolo : carrello) {
                    out.println(articolo + "<br>");
                }
            } else {
              out.println("Non ci sono articoli nel carrello!");
            }
       %>
</body>
</html>