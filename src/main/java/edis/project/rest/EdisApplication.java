package edis.project.rest;

import edis.project.rest.config.AuthAPI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = { AuthAPI.class})
public class EdisApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdisApplication.class, args);
	}

}
