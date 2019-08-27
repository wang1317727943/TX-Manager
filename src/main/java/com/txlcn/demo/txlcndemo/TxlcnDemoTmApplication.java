package com.txlcn.demo.txlcndemo;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableTransactionManagerServer
@SpringBootApplication
@EnableAutoConfiguration(exclude = {DruidDataSourceAutoConfigure.class})
public class TxlcnDemoTmApplication {

	public static void main(String[] args) {
		SpringApplication.run(TxlcnDemoTmApplication.class, args);
	}

}
