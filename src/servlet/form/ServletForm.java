package servlet.form;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servletForm") //http://localhost:8080/Corso_JAVA_EE/servlet/form/home.jsp
public class ServletForm extends HttpServlet{
    @Override
    /**
     * Metodo doGet che controlla la ricezione dei due parametri nome e cognome
     * che arrivano dal form creato nel file home.jsp con method = get
     */
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        String cognome = req.getParameter("cognome");

        PrintWriter output = resp.getWriter();

        output.println("<!DOCTYPE html>");
        output.println("<head><title>Ciao!</title></head>");
        output.println("<body>");
        output.println("<h1>Ciao " + nome + " " + cognome + "</h1>");
        output.println("<p>sono nel doGet...</p>");
        output.println("</body>");
        output.println("</html>");
    }

    /**
     * Metodo doPost che controlla la ricezione dei due parametri nome e cognome
     * che arrivano dal form creato nel file home.jsp con method = post
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        String cognome = req.getParameter("cognome");

        PrintWriter output = resp.getWriter();

        output.println("<!DOCTYPE html>");
        output.println("<head><title>Ciao!</title></head>");
        output.println("<body>");
        output.println("<h1>Ciao " + nome + " " + cognome + "</h1>");
        output.println("<p>sono nel doPost...</p>");
        output.println("</body>");
        output.println("</html>");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }
}
