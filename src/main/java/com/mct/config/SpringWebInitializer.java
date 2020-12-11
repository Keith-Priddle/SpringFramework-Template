package com.mct.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
 
    @Override
    protected Class[] getServletConfigClasses() {
        return new Class[] { WebConfig.class, WebSecurityConfig.class };
    }
 
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/api/*"};
    }
 
    @Override
    protected Class[] getRootConfigClasses() {
        return new Class[] {};
    }
    
    
}