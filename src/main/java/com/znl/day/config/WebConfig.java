package com.znl.day.config;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author dell
 * @描述:
 * @文件名: web.java
 * @创建人: zyhNick
 * @创建时间: 16:18 2021/3/11
 * @修改人:
 * @修改备注: Copyright  2021/3/11
 */
@ControllerAdvice
@Configuration
public class WebConfig implements WebMvcConfigurer {

    /**
     * @作用:静态资源放行
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }
}
