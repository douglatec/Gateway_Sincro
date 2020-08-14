package br.com.sincro.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class SimpleNettyServer {

	@Autowired
	private Environment environment;

	@Bean
	public void startSimpleNettyServer() {

		try {
			SimpleNettyServerBootstrap simpleNettyServerBootstrap = new SimpleNettyServerBootstrap();
			simpleNettyServerBootstrap.start(Integer.parseInt(environment.getProperty("server.port")));
		} catch (InterruptedException e) {
			e.printStackTrace();

		}

	}

}
