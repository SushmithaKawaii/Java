package com.hibernate.demo.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@PropertySource(value= {"classpath:application.properties"})
public class dbConfig {
	
	@Value("${jdbc.driverClassName}")
	private String driverClass;
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String username;
	@Value("${spring.datasource.password}")
	private String password;
	@Value("${spring.jpa.properties.hibernate.dialect}")
	private String dialect;
	
	@Bean
	public DataSource getDataSource()
	{
		DataSource dataSource = new DriverManagerDataSource(url, username, password);
		((DriverManagerDataSource) dataSource).setDriverClassName(driverClass);
		return dataSource;
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean factory = new LocalSessionFactoryBean();
		factory.setDataSource(getDataSource());
		factory.setHibernateProperties(HibernateProperties());
		factory.setPackagesToScan(new String[] {"com.hibernate.demo.model"});
		return factory;
		
	}
	
	private Properties HibernateProperties() {
		Properties properties = new Properties();
		properties.put("spring.jpa.hibernate.dialect", properties);
		properties.put("spring.jpa.hibernate.ddl-auto", "update");
		properties.put("spring.jpa.hibernate.show_sql", "true");
		properties.put("spring.jpa.hibernate.format_sql", "true");
		return properties;
		
	}
	
	@Bean
	public HibernateTransactionManager transactionManager(SessionFactory factory) {
		
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(factory);
		return transactionManager;
	}

}
