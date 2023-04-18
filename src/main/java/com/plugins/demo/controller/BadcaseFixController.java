package com.plugins.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author songbg
 * @since 2023/4/18 9:57
 */
@RestController
@RequestMapping("/badcase")
public class BadcaseFixController {

    @GetMapping("/page")
    public String list() {
        return "badcase list";
    }
}
