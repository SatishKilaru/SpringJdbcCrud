package com.example;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AppConfig {

	@Bean
	public DataSource dataSource() {
		// Create and configure your data source here
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://192.168.110.48:5432/plf_training");
		dataSource.setUsername("plf_training_admin");
		dataSource.setPassword("pff123");
		return dataSource;
	}

	@Bean
	public EmployeeDAO employeeDAO(DataSource dataSource) {
		return new EmployeeDAOImpl(dataSource);
	}
}
