package com.danilojakob.transactionviolation.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    /**
     * Code from https://github.com/zlict/m223-punchclock
     * @param registry {@link CorsRegistry}
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("*")
                .exposedHeaders(
                        "Access-Control-Allow-Headers",
                        "Access-Control-Allow-Origin",
                        "Access-Control-Expose-Headers",
                        "Authorization",
                        "Cache-Control",
                        "Content-Type",
                        "Origin"
                );
    }
}
