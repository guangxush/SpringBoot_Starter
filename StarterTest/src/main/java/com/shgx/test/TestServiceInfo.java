package com.shgx.test;

import com.shgx.starter.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: guangxush
 * @create: 2020/08/08
 */
@Service
public class TestServiceInfo {
    @Resource
    private TestService testService;

    public String getName(){
        return testService.getName();
    }
}
