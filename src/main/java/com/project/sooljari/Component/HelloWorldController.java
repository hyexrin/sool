package com.project.sooljari.Component;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/api/hello")
    public String test() {
        return "Hello";
    }

    @GetMapping("/api/data")
    public String data() { return "data"; }
}