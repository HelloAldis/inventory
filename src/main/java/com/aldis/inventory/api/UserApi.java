package com.aldis.inventory.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class UserApi {

    public UserApi() {
    }

    @RequestMapping("/get")
    @ResponseBody
    public String get() {
        return "hello";
    }
}
