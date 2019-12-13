package top.cpming.spring.logrequesttime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Order(Ordered.HIGHEST_PRECEDENCE)
public class RequestTimeFilter implements Filter {
    private static final Logger logger = LoggerFactory.getLogger(RequestTimeFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // empty
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        long time = System.currentTimeMillis();
        try {
            chain.doFilter(request, response);
        } finally {
            time = System.currentTimeMillis() - time;
            String url = ((HttpServletRequest) request).getRequestURI();
            logger.info(url + " " + time + "ms");
        }
    }

    @Override
    public void destroy() {
        // empty
    }
}