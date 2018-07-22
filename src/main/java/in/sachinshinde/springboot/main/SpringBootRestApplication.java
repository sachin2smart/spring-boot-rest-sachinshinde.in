package in.sachinshinde.springboot.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Added the component path, so that application can find the Controller Class
@SpringBootApplication(scanBasePackages = {"in.sachinshinde"})
public class SpringBootRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApplication.class, args);
	}
}
