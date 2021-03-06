package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value="/greeting", method=RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE, consumes = MediaType.ALL_VALUE )
    @ResponseBody
    public Greeting greeting(@RequestParam( value = "name", defaultValue = 
                  "World") String name) {
                      System.out.println(name);
                      return new Greeting(counter.incrementAndGet(),String.format( 
                          template, name ));
    }

    @GetMapping("/greet/{id}")
    public Greeting greetingId(@PathVariable String id) {
        System.out.println("In Path Variable method");
        return new Greeting(counter.incrementAndGet(), id);
    }

    @PostMapping("/greeting")
    public ResponseEntity<String> post() {
        return new ResponseEntity<String>("Data Posted",HttpStatus.OK);
    }
}