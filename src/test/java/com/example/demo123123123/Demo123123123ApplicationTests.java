package com.example.demo123123123;

import com.example.demo123123123.utils.HttpUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

@SpringBootTest
class Demo123123123ApplicationTests {

    @Test
    void contextLoads() {
        String url="http://localhost:8080/post_horse_war/getAllBooks.action";
        HashMap<String,String> hashMap=new HashMap<>();
        String doGet = HttpUtils.doGet(url, hashMap);
        System.out.println(doGet);
    }

}
