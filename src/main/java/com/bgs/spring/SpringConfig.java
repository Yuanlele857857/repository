package com.bgs.spring;

import com.bgs.dao.UserDao;
import com.bgs.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //通过该注解来表明该类是一个Spring的配置，相当于一个xml文件
public class SpringConfig {

    //@Bean用于向容器中放入对象，如果在UserDao类前面打上@Repository注解就不用@Bean方式
    @Bean // 通过该注解来表明是一个Bean对象，相当于xml中的<bean>
    public UserDao getUserDAO(){
        return new UserDao(); // 直接new对象做演示
    }
    @Bean
    public UserService getUserService(){
        return new UserService();
    }

}

