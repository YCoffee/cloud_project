package coffee.y.cloud.consumerfeign.svc.Impl;

import coffee.y.cloud.consumerfeign.svc.HiService;
import org.springframework.stereotype.Service;

@Service
public class HiServiceImpl implements HiService {

    @Override
    public String hello(String name) {
        return null;
    }
}
