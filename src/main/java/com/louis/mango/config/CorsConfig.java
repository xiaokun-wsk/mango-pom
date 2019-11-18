package com.louis.mango.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by IntelliJ IDEA.
 *
 * @author xiaokun wang
 * description:
 * path: mango-v2-com.louis.mango.config-CorsConfig
 * date: 2019/11/16 17:03
 */
@Configuration //表示这是一个配置类
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**")//允许跨域访问的路径  所有
        .allowedOrigins("*")//允许跨域访问的源 所有
        .allowedMethods("POST","GRT","PUT","OPTIONS","DELETE")//允许请求的方法
        .maxAge(16800)//设置预检时间
        .allowedHeaders("*")//允许头部设置
        .allowCredentials(true);//是否发送cookie
    }
}
