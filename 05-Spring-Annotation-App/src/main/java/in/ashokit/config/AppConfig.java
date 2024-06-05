package in.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import in.ashokit.Engine;

@Configuration
@ComponentScan(basePackages={"in.ashokit","com.tcs"})
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig::Constructor");
	}
	
	@Bean
	public Engine getEngine() {
		Engine eng=new Engine();
		return eng;
	}
	
}
