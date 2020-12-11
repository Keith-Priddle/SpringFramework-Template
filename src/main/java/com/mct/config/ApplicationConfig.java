package com.mct.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories
@EnableTransactionManagement
@EnableAspectJAutoProxy
@EnableWebSecurity
public class ApplicationConfig {

	@Bean
	public DataSource dataSource() {
		
		EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
		return builder.setType(EmbeddedDatabaseType.H2).build();
	}
	
}
