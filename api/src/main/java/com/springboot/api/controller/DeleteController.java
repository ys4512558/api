package com.springboot.api.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/delete-api")
public class DeleteController {

    //@PathVariable을 통해 url로 값을 받아 로직 처리
    //@PathVariable은 value = "/{variable}"의 변수명과 매개변수가 같아야 함
    //http://localhost:8080/api/v1/delete-api/{String 값}
    @DeleteMapping(value = "/{variable}")
    public String DeleteVariable(@PathVariable String variable){
        return variable;
    }

    //@RequestParam을 활용하여 다른 값도 받을 수 있도록함
    //http://localhost:8080/api/v1/delete-api/request1?email=value
    @DeleteMapping(value = "/request1")
    public String getRequestParam(@RequestParam String email){
        return "email : " + email;
    }



}
