package com.yangjiawang.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @author shining
 */
@Configuration
public class CorsConfig {
    private String[] orgins=new String[]{
            "localhost",
            "127.0.0.1",
            "localhost:8080"
    };

    @Bean
    public CorsFilter corsFilter(){
        CorsConfiguration configuration=new CorsConfiguration();
        //配置跨域访问来源
        for(String orgin:orgins){
            configuration.addAllowedOrigin("http://"+orgin);
            configuration.addAllowedOrigin("https://"+orgin);
        }
        configuration.addAllowedHeader("*");
        configuration.addAllowedMethod("*");
        //设置服务端允许发送cookie和http认证信息
        //configuration.setAllowCredentials(true);
        //设置服务端哪些接口路径允许使用上面配置的跨域访问
        UrlBasedCorsConfigurationSource source=new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/api/**",configuration);
        return new CorsFilter(source);
        //返回跨域访问过滤器
    }

}
