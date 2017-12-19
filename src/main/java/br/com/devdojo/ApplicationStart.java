package br.com.devdojo;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Import;

//@EnableAutoConfiguration
//@Import(value = ApplicationScan.class)
//@Configuration

@SpringBootApplication
public class ApplicationStart {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationStart.class, args);
	}

}
