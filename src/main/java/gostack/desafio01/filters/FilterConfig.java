package gostack.desafio01.filters;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * FilterConfig
 */
@Configuration
public class FilterConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new VerifyProject()).addPathPatterns("/projects/{id}");
        registry.addInterceptor(new VerifyProject()).addPathPatterns("/projects/{id}/*");
    }
}