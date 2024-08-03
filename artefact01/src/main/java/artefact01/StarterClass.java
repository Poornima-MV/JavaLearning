package artefact01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
public class StarterClass {

	public static void main(String[] args) {
		SpringApplication.run(StarterClass.class, args);
	}

	
	@PropertySource("classpath:application.properties")
	public class PropertiesWithJavaConfig {
	    //...
	}
	

}