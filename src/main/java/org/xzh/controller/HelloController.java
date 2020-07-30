package org.xzh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Object hello() {
        System.out.println("hello, console");
        return "hello, test update to CI 2";
    }
}
