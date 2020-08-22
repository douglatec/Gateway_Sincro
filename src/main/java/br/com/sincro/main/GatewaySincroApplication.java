package br.com.sincro.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.sincro.entity.PositionEntity;
import br.com.sincro.service.PositionService;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = "br.com.sincro.repository")
@EntityScan(basePackages = "br.com.sincro.entity")
//@ComponentScan(basePackages = "br.com.sincro.server")
public class GatewaySincroApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewaySincroApplication.class, args);

		PositionEntity positionEntity = new PositionEntity();
		PositionService positionService = new PositionService();

		positionEntity.setPosition(
				// "ST300STT;511013179;40;319H;20200803;19:01:00;41126;-25.463713;-049.274992;000.000;000.00;0;0;0;11.97;000000;1;0016;000000;3.5;0"
				"teset");

		positionService.save(positionEntity);

	}

}
