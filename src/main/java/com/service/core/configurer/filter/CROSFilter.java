package com.service.core.configurer.filter;

import com.service.sysservice.impl.DataInfoServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CROSFilter implements Filter {
    private static final Logger logger = LoggerFactory.getLogger(CROSFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String origin = "*";
        if (StringUtils.hasText(request.getHeader("Origin"))) {
            origin = request.getHeader("Origin");
        }
        logger.info("支持跨域,origin={}", origin);
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        response.setHeader("Access-Control-Allow-Origin", origin);
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, PATCH, DELETE, OPTIONS");
        response.setHeader("Access-Control-Allow-Headers", "Origin, Content-Type, Accept, __skcy, x-requested-with");
        response.setHeader("Access-Control-Max-Age", "1728000");
        if (request.getMethod().equalsIgnoreCase("OPTIONS")) {
            response.setStatus(HttpServletResponse.SC_OK);
            return;
        }
        filterChain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
