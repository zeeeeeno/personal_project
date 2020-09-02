package com.example.lecture.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    static final Logger log = LoggerFactory.getLogger(MainController.class);

    @GetMapping("/")
    public String main() {
        log.info("MainController: main()");

        return "main";
    }
}
