package com.eway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
* @author 程龙
* @version 创建时间：2019年11月22日 下午8:13:46
* @ClassName 类名称：
* @Description 类描述：
*/
@SpringBootApplication
public class ConsumerApplication {
    
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class);
    }
}
