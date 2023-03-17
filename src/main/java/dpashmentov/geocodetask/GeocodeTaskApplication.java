package dpashmentov.geocodetask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GeocodeTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeocodeTaskApplication.class, args);
    }

}
