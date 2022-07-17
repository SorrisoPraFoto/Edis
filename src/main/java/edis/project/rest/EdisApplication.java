package edis.project.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EdisApplication {
	public static String chave;
	public static void main(String[] args) {
		chave = args[0];
		SpringApplication.run(EdisApplication.class, args);
	}

}
