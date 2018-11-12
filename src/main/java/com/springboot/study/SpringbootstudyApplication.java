package com.springboot.study;

import com.springboot.study.aop.DynamicDataSourceAnnotationAdvisor;
import com.springboot.study.aop.DynamicDataSourceAnnotationInterceptor;
import com.springboot.study.dbconfig.DynamicDataSourceRegister;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@Import(DynamicDataSourceRegister.class)
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan(basePackages = {"com.springboot.study.dao"})
public class SpringbootstudyApplication {

	@Bean
	public DynamicDataSourceAnnotationAdvisor dynamicDatasourceAnnotationAdvisor() {
		return new DynamicDataSourceAnnotationAdvisor(new DynamicDataSourceAnnotationInterceptor());
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootstudyApplication.class, args);
	}
}
