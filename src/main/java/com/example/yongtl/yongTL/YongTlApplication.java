package com.example.yongtl.yongTL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class YongTlApplication {

	public static void main(String[] args) {
		SpringApplication.run(YongTlApplication.class, args);
	}

}
