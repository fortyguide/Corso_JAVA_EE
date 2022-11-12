<%@ include file = "header.jsp" %>

<section>
    <h1>Sono una JSP!</h1>

    <jsp:useBean id="articoloSelezionato" class="jsp.beans.ArticoloBeans" scope="request" />

    <p>
        <%  //http:localhost:8080/Corso_JAVA_EE/jsp/beans/include.jsp

            out.println("Articolo " + "<br>");
            articoloSelezionato.setNome("giocattolo");
            articoloSelezionato.setCodice("1111111111");
            articoloSelezionato.setPrezzo(10);
            out.println(articoloSelezionato.getNome() + "<br>");
            out.println(articoloSelezionato.getCodice() + "<br>");
            out.println(articoloSelezionato.getPrezzo() + "<br>");

            // Il blocco di codice sopra è equivalente quello di sotto

            out.println("<br>");
            out.println("Articolo " + "<br>");

        %>
            <jsp:setProperty name="articoloSelezionato" property="nome" value="giocattolo" />
            <jsp:setProperty name="articoloSelezionato" property="codice" value="1111111111" />
            <jsp:setProperty name="articoloSelezionato" property="prezzo" value="10" />
            <jsp:getProperty name="articoloSelezionato" property="nome" />
            <br>
            <jsp:getProperty name="articoloSelezionato" property="codice" />
            <br>
            <jsp:getProperty name="articoloSelezionato" property="prezzo" />

    </p>
</section>

<%@ include file = "footer.jsp" %>