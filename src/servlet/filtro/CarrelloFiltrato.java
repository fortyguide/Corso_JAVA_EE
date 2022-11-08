package servlet.filtro;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/carrellofiltrato") //http://localhost:8080/Corso_JAVA_EE/carrellofiltrato
public class CarrelloFiltrato extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<String> carrello = (List<String>) req.getSession().getAttribute("carrello");

        /*Se il carrello non c'è, lo creiamo*/
        if (carrello == null){
            carrello = new ArrayList<>();

            /*Associamo alla variabile "carrello" l'ipotetico carrello presente in memoria.
             * Questa variabile "carrello" è una variabile associata in sessione, per cui quando
             * la sessione si chiude, vengono cancellate tutte le variabili associate ad essa*/
            req.getSession().setAttribute("carrello", carrello);
        }

        /*Creiamo il parametro dove inserire l'articolo da comprare*/
        String articolo = req.getParameter("articolo");

        if (articolo != null &&
            !articolo.trim().equals("articolo") &&
            !articolo.trim().equals(req.getAttribute("articoloBomba")) &&
            !articolo.trim().equals(req.getAttribute("articoloPistola"))) {
            carrello.add(articolo);
        }

        req.getServletContext().getRequestDispatcher("/servlet/carrello/carrello.jsp").include(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
