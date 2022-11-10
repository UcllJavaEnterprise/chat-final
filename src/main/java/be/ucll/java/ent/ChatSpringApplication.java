package be.ucll.java.ent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class})
@EnableSwagger2 // Auto generate documentation using Swagger/openAPI
@EnableScheduling
public class ChatSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChatSpringApplication.class, args);
    }
}
