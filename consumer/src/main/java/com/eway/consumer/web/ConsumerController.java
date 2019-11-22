package com.eway.consumer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.eway.consumer.pojo.User;

/**
* @author 程龙
* @version 创建时间：2019年11月22日 下午8:21:08
* @ClassName 类名称：
* @Description 类描述：
*/
@RestController
@RequestMapping("consumer")
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;
    
    @GetMapping("{id}")
    public User queryById(@PathVariable("id") Long id) {
        String url = "http://localhost:8095/user/"+id;
        User user = restTemplate.getForObject(url, User.class);
        return user;
    }
}
