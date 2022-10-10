package com.example.springboottest;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/helloworld")
public class HelloWorldController {


    @GetMapping
    public String getHelloMessage(@RequestParam String name){
        return "hello " + name;
    }
    @GetMapping("/byemessage")
    public String getByeMessage(){
        return "bye world";
    }


    @PostMapping
    public String postString(@RequestBody String name ){
        return   name +" " +  name.length();
    }
    @GetMapping("{id}" )
    public String inputId(@PathVariable String id){
        return "Hello moin " + id;
    }
}
