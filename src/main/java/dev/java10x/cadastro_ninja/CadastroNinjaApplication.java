package dev.java10x.cadastro_ninja;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CadastroNinjaApplication {

	public static void main(String[] args) {

		Dotenv dotenv = Dotenv.load();

		// Injeta no System para o Spring Boot conseguir usar
		System.setProperty("DATABASE_URL", dotenv.get("DATABASE_URL"));
		System.setProperty("DATABASE_USERNAME", dotenv.get("DATABASE_USERNAME"));
		System.setProperty("DATABASE_PASSWORD", dotenv.get("DATABASE_PASSWORD"));
		SpringApplication.run(CadastroNinjaApplication.class, args);

	}

}
