package service.EJB_stateless;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RichiamoEJBStateless") //http://localhost:8080/Corso_JAVA_EE/RichiamoEJBStateless
public class EseguoEJBStatelessServlet extends HttpServlet {

    @EJB
    EJBStatelessLocal ejbStatelessLocal;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String saluto = ejbStatelessLocal.saluto();
        req.setAttribute("salutoEJB", saluto);
        req.getServletContext().getRequestDispatcher("/service/EJB_stateless/RichiamoEJBStateless.jsp").include(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
