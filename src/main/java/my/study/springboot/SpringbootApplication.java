package my.study.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

    @Value("${failureTest}")
    private String failureTest;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

}
