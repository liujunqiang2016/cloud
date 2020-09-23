package com.test.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
public class ClientApplication {

	/**
	 * 主方法
	 * @param args
	 */
	public static void main(String[] args){
		System.out.println("aaaaaaaaaaaaaaaaaaaaa");
		System.out.println("bbbbbbbbbbbbbbbbbbbbbb");
		SpringApplication.run(ClientApplication.class, args);
	}
}
