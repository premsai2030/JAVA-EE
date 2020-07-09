package prem.sai;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "prem.sai")
@PropertySource(value= {"classpath:all_properties.properties"})
public class Config {
@Bean
public second sec() {
	return new second();
}
@Bean//it is an object in the container with id three
public third three() {//the method name three is simply an id for the object of class third
	return new third();
}
}
