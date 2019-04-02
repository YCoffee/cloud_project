package coffee.y.cloud.zuulservice.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
public class CloudFilter extends ZuulFilter {
    //过滤类型
    @Override
    public String filterType() {
       // pre：路由之前
       // routing：路由之时
       // post： 路由之后
       // error：发送错误调用
        return "pre";
    }

    //过滤顺序
    @Override
    public int filterOrder() {
        return 0;
    }

    //是否过滤
    @Override
    public boolean shouldFilter() {
        return true;
    }

    //过滤逻辑
    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();

        Object token = request.getParameter("token");
        if (token == null){
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(4001);
            try {
                context.getResponse().getWriter().write("token is empty!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}