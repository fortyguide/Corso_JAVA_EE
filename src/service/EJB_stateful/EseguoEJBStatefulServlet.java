package service.EJB_stateful;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RichiamoEJBStateful") //http://localhost:8080/Corso_JAVA_EE/RichiamoEJBStateful
public class EseguoEJBStatefulServlet extends HttpServlet{

    @EJB
    EJBStatefulLocal ejbStatefulLocal;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("contatore", ejbStatefulLocal.incrementa(1));
        if (req.getAttribute("contatore").equals(2)){
            ejbStatefulLocal.chiudiConnessione();
        }
        req.getServletContext().getRequestDispatcher("/service/EJB_stateful/RichiamoEJBStateful.jsp").include(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
