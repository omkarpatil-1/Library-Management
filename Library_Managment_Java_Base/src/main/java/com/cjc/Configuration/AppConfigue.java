package com.cjc.Configuration;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.cjc.model.Books;

@Configuration
@ComponentScan(basePackages="com.cjc")
@EnableWebMvc


public class AppConfigue {
    @Bean
	public InternalResourceViewResolver viewResolver() {

		InternalResourceViewResolver vs = new InternalResourceViewResolver();

		vs.setPrefix("/WEB-INF/view/");
		vs.setSuffix(".jsp");

		return vs;

	}
	
    @Bean
	public DriverManagerDataSource driverManagerDataSource() {
		
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/Library");
		ds.setUsername("root");
		ds.setPassword("root");
		
		return ds;
		
		
	}
    @Bean
	public LocalSessionFactoryBean SessionFactory() {
		
		LocalSessionFactoryBean sf = new LocalSessionFactoryBean();
		sf.setDataSource(driverManagerDataSource());
		
		Properties ps = new Properties();
		ps.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		ps.put("hibernate.show_sql", true);
		ps.put("hibernate.hbm2ddl.auto","update");
		
		
		
		sf.setHibernateProperties(ps);
		sf.setAnnotatedClasses(Books.class);
		
		return sf;
		
		
		
		
	}

}
