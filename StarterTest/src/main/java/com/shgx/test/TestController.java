package com.shgx.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: guangxush
 * @create: 2020/08/08
 */
@RestController
public class TestController {

    @Autowired
    private TestServiceInfo testServiceInfo;

    @GetMapping("/hello")
    public String testHello(){
        // http://localhost:8080/hello
        return testServiceInfo.getName();
    }
}
