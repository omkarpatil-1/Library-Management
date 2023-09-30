package com.cjc.Configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AppInitializer implements WebApplicationInitializer{

	public void onStartup(ServletContext servletContext) throws ServletException {
	 
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		
		context.register(AppConfigue.class);
		context.setServletContext(servletContext);
		
		ServletRegistration.Dynamic reg = servletContext.addServlet("Dispatcher", new DispatcherServlet(context));		

	reg.addMapping("/");
	
	}
	
	
	

}
