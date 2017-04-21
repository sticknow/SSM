package com.hy.ssm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.io.IOException;

/**
 * Created by LynAs on 20-Jan-16
 */
@EnableWebMvc
@ComponentScan("com.hy.ssm")
public class WebConfig extends WebMvcConfigurerAdapter{
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setExposeContextBeansAsAttributes(true);
        return viewResolver;
    }

    @Bean
    public StandardServletMultipartResolver multipartResolver() throws IOException {
        StandardServletMultipartResolver multipartResolver = new StandardServletMultipartResolver();
        //以下配置CommonsMultipartResolver就需要
//        multipartResolver.setUploadTempDir(new FileSystemResource("/com/hy/ssm/uploads"));
//        multipartResolver.setMaxUploadSize(2097152L);
//        multipartResolver.setMaxInMemorySize(4096);

        return multipartResolver;
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

}
