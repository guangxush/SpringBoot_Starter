package com.shgx.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @author: guangxush
 * @create: 2020/08/08
 */
@Configuration
@EnableConfigurationProperties(MyProperties.class)
public class TestAutoConfiguration {

    @Resource
    private MyProperties properties;

    /**
     * 在Spring上下文中创建一个对象
     */
    @Bean
    @ConditionalOnMissingBean
    public TestService init(){
        TestService testService = new TestService();
        String name = properties.getName();
        testService.setName(name);
        return testService;
    }
}
