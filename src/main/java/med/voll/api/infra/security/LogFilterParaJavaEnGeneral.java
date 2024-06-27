package med.voll.api.infra.security;

import jakarta.servlet.*;

import java.io.IOException;
import java.time.LocalDateTime;

//@WebFilter(urlPatterns = "/api/**")
public class LogFilterParaJavaEnGeneral implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Requisición recibida en: " + LocalDateTime.now());
        filterChain.doFilter(servletRequest, servletResponse);
    }

}