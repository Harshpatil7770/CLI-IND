package com.cls.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/*
 * @SpringBootApplication 
 * It is combination of three annotations.
 * @EnableAutoConfiguration it configure application automatically based on their dependencies
 * @ComponentScan It scan package for bean
 * @Configuration Is used by spring container act as source bean definitions.
 * 
 * @EnableConfigServer
 * It configure your application as config server.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

	/*
	 * Purpose of config server and How to enable it?
	 * 
	 * To enbale config server first we need to add spring cloud config server
	 * dependencies. Default port number is 8888. It acts like as centralized server
	 * or common server. So keep all properties file on this server, so we don't
	 * need to right properties individually for the service we just add config
	 * server url in that application.
	 */

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
		System.out.println("****************************************************");
		System.out.println("****************************************************");
		System.out.println("****************************************************");
		System.out.println("************* Welcome To CLI Appplication **********");
		System.out.println("****************************************************");
		System.out.println("****************************************************");
		System.out.println("****************************************************");

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.err.println(e.getStackTrace());
		}

		System.out.println("****************************************************");
		System.out.println("****************************************************");
		System.out.println("****************************************************");
		System.out.println("**************** Config Server Started *************");
		System.out.println("****************************************************");
		System.out.println("****************************************************");
		System.out.println("****************************************************");

	}

}
