package com.jinx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @progrom: helloworld-syso
 * @description:
 * @author: chujg
 * @create: 2019-01-18 17:56
 **/
@RestController
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "helloworld";
    }
}
