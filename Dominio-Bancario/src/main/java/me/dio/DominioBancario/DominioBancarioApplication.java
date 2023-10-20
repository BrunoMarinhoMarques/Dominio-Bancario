package me.dio.DominioBancario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(servers = { @Server(url = "/", description = "Default Server")})
@SpringBootApplication
public class DominioBancarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(DominioBancarioApplication.class, args);
	}

}
