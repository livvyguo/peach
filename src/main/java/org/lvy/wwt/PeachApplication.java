package org.lvy.wwt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("org.lvy.wwt.mapper")
@EnableTransactionManagement
public class PeachApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeachApplication.class, args);
	}
}
