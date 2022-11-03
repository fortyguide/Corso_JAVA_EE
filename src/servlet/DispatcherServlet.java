package servlet;

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
     * i tre file JSP denominati header.jsp, body.jsp e footer.jsp
     */
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /*Mediante il metodo include stiamo includendo in un'unica response i tre file JSP*/
        req.getServletContext().getRequestDispatcher("/servlet/dispatching/header.jsp").include(req,resp);
        req.getServletContext().getRequestDispatcher("/servlet/dispatching/body.jsp").include(req,resp);
        req.getServletContext().getRequestDispatcher("/servlet/dispatching/footer.jsp").include(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}

