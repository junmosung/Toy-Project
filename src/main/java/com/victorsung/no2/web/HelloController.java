package com.victorsung.no2.web;

import com.victorsung.no2.web.dto.HelloResponseDto;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    // curl -i -X GET "http://localhost:8080/hello/dto?name=test&age=100"로 확인 가능
    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam String name,@RequestParam int age){
        return new HelloResponseDto(name,age);
    }
}
