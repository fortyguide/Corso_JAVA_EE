package servlet.dispatching;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/dispatcher") //http://localhost:8080/Corso_JAVA_EE/dispatcher
public class DispatcherServlet extends HttpServlet {
    @Override
    /**
     * Metodo doGet che unisce in unico output (in un'unica pagina HTML)
     * i due file JSP denominati header.jsp e footer.jsp e,
     * in base al parametro inserito nella request, include uno tra i
     * file JSP denominati pagina1.jsp, pagina2.jsp, pagina3.jsp
     * e body.jsp (di default se non ci sono parametri nella request)
     */
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /*Mediante il metodo include stiamo includendo in un'unica response più file JSP*/
        req.getServletContext().getRequestDispatcher("/servlet/dispatching/header.jsp").include(req,resp);

        String pagina = req.getParameter("pagina");

        /*Controllo se il parametro "pagina" è stato configurato*/
        if (pagina != null && !pagina.trim().equals("")){
            switch (pagina) {
                case "1": //http://localhost:8080/Corso_JAVA_EE/dispatcher?pagina=1
                    req.getServletContext().getRequestDispatcher("/servlet/dispatching/pagina1.jsp").include(req,resp);
                    break;

                case "2": //http://localhost:8080/Corso_JAVA_EE/dispatcher?pagina=2
                    req.getServletContext().getRequestDispatcher("/servlet/dispatching/pagina2.jsp").include(req,resp);
                    break;

                case "3": //http://localhost:8080/Corso_JAVA_EE/dispatcher?pagina=3
                    req.getServletContext().getRequestDispatcher("/servlet/dispatching/pagina3.jsp").include(req,resp);
                    break;
            }
        } else {
            // http://localhost:8080/Corso_JAVA_EE/dispatcher
            req.getServletContext().getRequestDispatcher("/servlet/dispatching/body.jsp").include(req,resp);
        }
        req.getServletContext().getRequestDispatcher("/servlet/dispatching/footer.jsp").include(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}

