package com.pcc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller 和 @ResponseBody
public class QuickController {
    @RequestMapping("quick")
    //@ResponseBody
    public String quick() {
        return "ee";
    }
}
