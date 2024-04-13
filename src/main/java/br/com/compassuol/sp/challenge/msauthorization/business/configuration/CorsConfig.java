package br.com.compassuol.sp.challenge.msauthorization.business.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    WebMvcConfigurer getCorsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(@NonNull CorsRegistry corsRegistry) {
                corsRegistry
                        .addMapping("/**")
                        .allowedOrigins("http://127.0.0.1:8080")
                        .allowedMethods("GET", "POST", "PUT")
                        .allowedHeaders("*");
            }
        };
    }
}
