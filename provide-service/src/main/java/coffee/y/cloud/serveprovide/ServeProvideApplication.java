package coffee.y.cloud.serveprovide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServeProvideApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServeProvideApplication.class, args);
    }

}
