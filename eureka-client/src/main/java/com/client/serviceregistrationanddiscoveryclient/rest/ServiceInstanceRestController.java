package com.client.serviceregistrationanddiscoveryclient.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceInstanceRestController {

    @RequestMapping("/greeting")
    public void greeting() {
        System.out.println("Greeting client 1");
    }

}
