package com.edgenative.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("say/hello")
    public String sayHello(@RequestParam(defaultValue = "world") String name) {
        return "Hello, " + name + " from Atlanta";
    }
}
