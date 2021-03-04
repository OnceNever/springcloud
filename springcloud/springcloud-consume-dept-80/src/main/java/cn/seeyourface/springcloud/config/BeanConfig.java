package cn.seeyourface.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: BeanConfig
 * @Description: TODO
 * @Author: Yanglei
 * @Date: 2021/2/11 16:15
 * @Version: V1.0
 */
@Configuration
public class BeanConfig { //@Configuration  相当于spring中的 applicationContext.xml

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
