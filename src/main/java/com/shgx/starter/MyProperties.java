package com.shgx.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author: guangxush
 * @create: 2020/08/08
 */
@ConfigurationProperties(prefix = "test")
public class MyProperties {
    // 自动获取配置文件中前缀为test的属性，把值传入对象参数
    private String name = "hello";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
