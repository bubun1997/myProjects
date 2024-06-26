package com.soumya.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan({"com.soumya"})
//@PropertySource(value = { "classpath:application.properties" })
public class SpringConfig implements WebMvcConfigurer{
	
	
	 
	    @Bean
	    public InternalResourceViewResolver viewResolver() {
	 		
	        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//	        viewResolver.setViewClass(JstlView.class);
	        viewResolver.setPrefix("/WEB-INF/views/");
	        viewResolver.setSuffix(".jsp");
	        
	        return viewResolver;
	    }
	    
	    @Bean
	    public CommonsMultipartResolver multipartResolver() {
	    	
	    	return new CommonsMultipartResolver();
	    }

	    @Override
		public void addResourceHandlers(ResourceHandlerRegistry registry) {
	    	
			registry.addResourceHandler("/resources/**")
					.addResourceLocations("/WEB-INF/resources/");
		}
}
