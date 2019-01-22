//package com.service.core.configurer;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
///**
// * Created by songmeng on 2018/12/21.
// * 读取服务器文件的配置
// */
//@Configuration
//public class SourceConfiguration extends WebMvcConfigurerAdapter {
//
//    @Value("${sword.uploadPath}")
//    private String path;
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/file/**").addResourceLocations("file:/Users/songmeng/Desktop/");
//        super.addResourceHandlers(registry);
//    }
//}
//
