package pe.gob.mef.cloud.moroccoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DemocjavaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemocjavaServiceApplication.class, args);
	}
}
