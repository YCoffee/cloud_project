package coffee.y.cloud.consumerribbon.controller;

import coffee.y.cloud.consumerribbon.svc.HiService;
import coffee.y.cloud.consumerribbon.svc.impl.HiServiceImpl;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    HiService hiService;

    @GetMapping("hi")
    @HystrixCommand(fallbackMethod = "hiError")
    public String hi(@RequestParam String name) {
        return hiService.hello(name);
    }

    public String hiError(String name) {
        return "Hello World!--" + name+"--Ribbon Error!";
    }
}
