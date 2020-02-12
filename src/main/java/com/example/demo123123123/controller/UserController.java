package com.example.demo123123123.controller;

import com.example.demo123123123.common.SzpJsonResult;
import com.example.demo123123123.request.FindUserRequest;
import com.example.demo123123123.response.UserResponse;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @PostMapping("a")
    public Object findUseByPageHelper(@RequestBody FindUserRequest request){
        return null;
    }

    @GetMapping
    public Object findUserByGet(@RequestParam(value = "name") String username,
                                @RequestParam(value = "page",required = true)Integer page,
                                @RequestParam(value = "size",required = true)Integer size){
        return null;
    }

    @GetMapping("get/{name}")
    public Object findAll(@PathVariable(value = "name") String username,
                          @RequestParam(value = "page",required = true)Integer page,
                          @RequestParam(value = "size",required = true)Integer size){
        return null;
    }
    @GetMapping("test")
    public Object findAllUser(String username,Integer page,Integer size){
        System.out.println(username);
        //对字符串进行校验
       if (StringUtils.isEmpty(username)){
           throw new RuntimeException("用户名必须传入");
       }

       if (username==null||"".equals(username)){
           throw new RuntimeException("用户名必须传入");
       }

        return null;
    }

    public SzpJsonResult<UserResponse> findAllBook(){
        return null;
    }
}
