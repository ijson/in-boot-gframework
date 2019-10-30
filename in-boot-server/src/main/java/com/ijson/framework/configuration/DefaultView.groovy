package com.ijson.framework.configuration

import org.springframework.core.Ordered
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

/**
 * desc:
 * version: 6.7
 * Created by cuiyongxu on 2019/10/30 11:56 PM
 */
class DefaultView implements WebMvcConfigurer {

    @Override
    void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index.html");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }

    @Override
    void addInterceptors(InterceptorRegistry registry) {

    }
}
