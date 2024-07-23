package com.juliorazo.tiendas_patito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class TiendasPatitoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TiendasPatitoApplication.class, args);
	}

}
