package edu.neu.cs4500.controller.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/api/hello/string")
    public String sayHello() {
        return "Hello Jose Annunziato!";
    }
    @RequestMapping("/api/hello/object")
    public HelloObject sayHelloObject() {
        HelloObject obj = new HelloObject("Hello Object CS4500!");
        return obj;
    }
}
