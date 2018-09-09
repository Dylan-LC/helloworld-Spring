package com.yongyan;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by yongyan on 90/08/2018
 */

public class HelloWorladInitializer extends AbstractAnnotationConfigDispatcherServletInitializer { // Ctrl + click, read the source file
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {HelloWorldConfiguration.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null; // there is no ServletConfig
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
