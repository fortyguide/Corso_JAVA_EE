package servlet.filter_chain;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

@WebFilter("/*")
/**
 * Classe che serve per impostare l'ordine in cui devono essere eseguiti i filtri
 */
public class GodFilter implements Filter {

    private Map<Pattern, Filter> filters = new LinkedHashMap<Pattern, Filter>();

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        /*Filter1 filter1 = new Filter1();
        filter1.init(config);
        filters.put(new Pattern("/foo/*"), filter1);

        Filter2 filter2 = new Filter2();
        filter2.init(config);
        filters.put(new Pattern("*.bar"), filter2);

        // ...*/

        BombaFilter bombaFilter = new BombaFilter();
        bombaFilter.init(filterConfig);
        filters.put(new Pattern("/carrellofiltrato/*"), bombaFilter);

        PistolaFilter pistolaFilter = new PistolaFilter();
        pistolaFilter.init(filterConfig);
        filters.put(new Pattern("/carrellofiltrato/*"), pistolaFilter);

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest hsr = (HttpServletRequest) request;
        String path = hsr.getRequestURI().substring(hsr.getContextPath().length());
        GodFilterChain godChain = new GodFilterChain(chain);

        for (Map.Entry<Pattern, Filter> entry : filters.entrySet()) {
            if (entry.getKey().matches(path)) {
                godChain.addFilter(entry.getValue());
            }
        }

        godChain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        for (Filter filter : filters.values()) {
            filter.destroy();
        }
    }
}
