package com.springboot.api.controller;

import com.springboot.api.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/post-api")
public class PostController {

    //Post-api 예시
    @RequestMapping(value = "/domain", method = RequestMethod.POST)
    public String postExample(){
        return "Hello Post api";
    }

    //http://localhost:8080/api/v1/get-api/request3?name=value1&email=value2&organization=value3
    @PostMapping("/member")
    public String postMember(@RequestBody Map<String, Object> postData){
        //가변 문자열을 처리하기 위한 StringBuilder
        StringBuilder sb = new StringBuilder();

        //entrySet()메소드는 HashMap에 저장된 키-값의 데이터를 결합된 형태로 Set에 저장하여 반환해줍니다.
        postData.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });

        return sb.toString();
    }

    //MemberDto 사용
    @PostMapping(value = "/member2")
    public String postMemberDto(@RequestBody MemberDto memberDto){
        return memberDto.toString();
    }


}
