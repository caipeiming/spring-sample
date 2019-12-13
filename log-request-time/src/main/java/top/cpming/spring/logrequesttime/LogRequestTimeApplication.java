package top.cpming.spring.logrequesttime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.servlet.Filter;

@SpringBootApplication
public class LogRequestTimeApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogRequestTimeApplication.class, args);
    }

    @Bean
    public Filter requestTimeFilter() {
        return new RequestTimeFilter();
    }
}
