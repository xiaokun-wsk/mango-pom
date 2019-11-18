package com.louis.mango.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 *
 * @author xiaokun wang
 * description:
 * path: mango-v2-com.ccit.controller-HelloController
 * date: 2019/11/13 16:43
 */
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello(){
        return "hello mango";
    }
}
