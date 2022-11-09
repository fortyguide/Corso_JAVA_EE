package servlet.filtro;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/*Il parametro in ingresso di @WebFilter deve essere
* l'URL della servlet, o file JSP, o web application
* che la classe con tale annotation deve filtrare.
* In alternativa il filtro può agire prima di tutti gli URL
* contemporaneamente con il parametro in ingresso "/*" */
@WebFilter("/carrellofiltrato")
public class ServletFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;

        req.setAttribute("articoloDaScartare", "bomba");

        /*Questa riga di codice deve essere sempre presente
        nel metodo doFilter e deve essere sempre l'ultima riga*/
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
