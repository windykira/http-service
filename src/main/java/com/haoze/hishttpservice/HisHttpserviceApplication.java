package com.haoze.hishttpservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//@MapperScan("com.haoze.hishttpservice.dao")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class HisHttpserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HisHttpserviceApplication.class, args);
	}
}
