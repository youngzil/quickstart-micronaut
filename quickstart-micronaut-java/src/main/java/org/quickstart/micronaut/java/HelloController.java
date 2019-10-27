package org.quickstart.micronaut.java;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/")
public class HelloController {

    @Get("/")
    public String hello() {
        return "Hello World micronaut java";
    }
}
