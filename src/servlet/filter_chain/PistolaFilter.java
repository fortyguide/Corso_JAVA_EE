package servlet.filter_chain;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class PistolaFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;

        req.setAttribute("articoloPistola", "pistola");

        /*Questa riga di codice deve essere sempre presente
        nel metodo doFilter e deve essere sempre l'ultima riga*/
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
