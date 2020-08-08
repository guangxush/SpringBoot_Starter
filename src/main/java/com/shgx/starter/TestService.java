package com.shgx.starter;

/**
 * 业务类
 * @author: guangxush
 * @create: 2020/08/08
 */
public class TestService {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String test(){
        return "test service";
    }
}
