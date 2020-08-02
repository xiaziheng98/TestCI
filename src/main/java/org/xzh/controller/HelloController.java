package org.xzh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Object hello() {
        System.out.println("hello, console");
        return "hello, test update to CI 2";
    }

    /**
     * 获取post  body里的内容
     * @param request
     * @return
     * @throws IOException
     */
    @PostMapping("/hook")
    public Object hook(HttpServletRequest request) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream()));

        String str = "";
        String wholeStr = "";
        while((str = reader.readLine()) != null){//一行一行的读取body体里面的内容；
            wholeStr += str;
        }
//        String userno = (String) t.get("userId");                   //得到想要的参数
        System.out.println("success" + wholeStr);
        return wholeStr;
    }
}
