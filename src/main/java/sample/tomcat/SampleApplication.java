package sample.tomcat;

import org.apache.catalina.Context;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.util.ClassUtils;

@SpringBootApplication
public class SampleApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

	// Tried to set class loader from context but it's always null. context.getLoader().getClassLoader() - returns null
	@Bean
	public ServletWebServerFactory servletContainer() {
		TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory() {
			@Override
			protected void postProcessContext(Context context) {
				//ClassUtils.overrideThreadContextClassLoader(context.getLoader().getClassLoader());
				//Thread.currentThread().setContextClassLoader(context.getLoader().getClassLoader());
			}
		};
		return tomcat;
	}
}