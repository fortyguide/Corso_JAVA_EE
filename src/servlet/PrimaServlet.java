package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/primaservlet") //http://localhost:8080/Corso_JAVA_EE/primaservlet
public class PrimaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        azioni(req, resp);

        resp.addCookie(new Cookie("corso-web", "success"));
        resp.getWriter().append("\n - nomeAttributo: " + (String)req.getAttribute("nomeAttributo"));
        //nomeAttributo: valore di prova
    }

    private void azioni(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().append(" - Served at: ").append(req.getContextPath()); // Served at: /Corso_JAVA_EE
        resp.getWriter().append("\n - Method: " + req.getMethod()); // Method: GET
        resp.getWriter().append("\n - User agent: " + req.getHeader("user-agent"));
        //  User agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/106.0.0.0 Safari/537.36

        Enumeration<String> en = req.getHeaderNames();
        while (en.hasMoreElements()){
            String element = en.nextElement();
            resp.getWriter().append("\n - element: " + req.getHeader(element));
            /* - element: localhost:8080
               - element: keep-alive
               - element: max-age=0
               - element: "Chromium";v="106", "Google Chrome";v="106", "Not;A=Brand";v="99"
               - element: ?0
               - element: "Windows"
               - element: 1
               - element: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/106.0.0.0 Safari/537.36
               - element: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*;q=0.8,application/signed-exchange;v=b3;q=0.9
               - element: none
               - element: navigate
               - element: ?1
               - element: document
               - element: gzip, deflate, br
               - element: it-IT,it;q=0.9,en-US;q=0.8,en;q=0.7 */
        }

        resp.getWriter().append("\n - Query string: " + req.getQueryString()); // Query string: null
        req.setAttribute("nomeAttributo", "valore di prova");
        resp.getWriter().append("\n - URL: " + req.getRequestURL()); //URL: http://localhost:8080/Corso_JAVA_EE/primaservlet
        resp.getWriter().append("\n - URI: " + req.getRequestURI()); //URI: /Corso_JAVA_EE/primaservlet
        resp.getWriter().append("\n - Servlet: " + req.getServletPath()); //Servlet: /primaservlet
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    public void init() throws ServletException {
        /* istanziare connessioni al DB */
        /* verificare che i REST web service da invocare rispondono correttamente */
        /* etc... */

        super.init();
    }

    @Override
    public void destroy() {
        /* chiudere connessioni al DB o ai servizi */
        /* scrivere eventuali log applicativi */
        /* etc... */

        super.destroy();
    }
}
