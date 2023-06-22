package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@RestController
public class FooController {
    @GetMapping("/foobar")
    public String foo() throws Exception {
        throw new Exception("Foobar");
    }
}
