package com.heitor.java.samples;

import com.heitor.java.samples.abstractsample.SampleExecutorHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;

@SpringBootApplication
public class SamplesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SamplesApplication.class, args);

		try {
			SampleExecutorHandler sampleExecutorHandler = context.getBean(SampleExecutorHandler.class);
			sampleExecutorHandler.executeSampleExecutor();
		} catch (Exception e){
			System.out.println(e);
		}
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUsername("root");
//		dataSource.setPassword("mysqlpass");
		dataSource.setUrl(
				"jdbc:mysql://localhost:3306/mydb?createDatabaseIfNotExist=true&serverTimezone=UTC");

		return dataSource;
	}
}

