package coffee.y.cloud.consumerfeign.controller;

import coffee.y.cloud.consumerfeign.svc.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    HiService hiService;

    @GetMapping("hi")
    public String hi(@RequestParam String name) {
        return hiService.hello(name);
    }
}
