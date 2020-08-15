package br.com.sincro.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = "br.com.sincro.repository")
@EntityScan(basePackages = "br.com.sincro.entity")
@ComponentScan(basePackages = "br.com.sincro.server")
public class GatewaySincroApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewaySincroApplication.class, args);

	}
}
