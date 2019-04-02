package coffee.y.cloud.consumerfeign.svc;

import coffee.y.cloud.consumerfeign.svc.FallBack.HiServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "SERVE-PROVIDE", fallback = HiServiceFallBack.class)
public interface HiService {
    @GetMapping("hello")
    public String hello(@RequestParam(value = "name") String name);
}
