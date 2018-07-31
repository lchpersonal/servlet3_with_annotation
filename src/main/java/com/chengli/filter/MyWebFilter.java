package com.chengli.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 拦截所有链接
 */
@WebFilter(urlPatterns = {"/*"})
public class MyWebFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("this is filter begin");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("this is filter end");
    }

    @Override
    public void destroy() {

    }
}
