package coffee.y.cloud.consumerfeign.svc.FallBack;

import coffee.y.cloud.consumerfeign.svc.HiService;
import org.springframework.stereotype.Component;

@Component
public class HiServiceFallBack implements HiService {
    @Override
    public String hello(String name) {
        return "Hello World!--" + name + "--Feign Error";
    }
}
