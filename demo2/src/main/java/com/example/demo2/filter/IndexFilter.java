package com.example.demo2.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Enumeration;

@WebFilter(filterName = "index-filter",urlPatterns = "/hello-servlet")
public class IndexFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        Enumeration<String> paramtersKey = httpServletRequest.getParameterNames();

        while (paramtersKey.hasMoreElements()){
            String paramName= paramtersKey.nextElement();
            System.out.println(paramName+" = "+httpServletRequest.getParameter(paramName));
        }

        filterChain.doFilter(httpServletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
