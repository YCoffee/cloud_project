package coffee.y.cloud.serveprovide.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServeProvideController {

    @Value("${server.port}")
    String port;

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "coffee") String name) {
        return "hello world!--" + name + "--" + port;
    }
}
