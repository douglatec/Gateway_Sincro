package br.com.sincro.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.sincro.server.SimpleNettyServerBootstrap;

@SpringBootApplication
public class GatewaySincroApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewaySincroApplication.class, args);
		
		try {
            SimpleNettyServerBootstrap simpleNettyServerBootstrap = new SimpleNettyServerBootstrap();
            simpleNettyServerBootstrap.start(7081);
        } catch (InterruptedException e) {
            e.printStackTrace();
            
        }
    }
	}


