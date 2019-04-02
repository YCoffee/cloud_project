package coffee.y.cloud.consumerribbon.svc.impl;

import coffee.y.cloud.consumerribbon.svc.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HiServiceImpl implements HiService {
    @Autowired
    RestTemplate restTemplate;

    @Override
    public String hello(String name) {
        return restTemplate.getForObject("http://SERVE-PROVIDE/hello?name=" + name, String.class);
    }
}
