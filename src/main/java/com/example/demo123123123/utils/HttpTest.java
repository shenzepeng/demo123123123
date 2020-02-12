package com.example.demo123123123.utils;

import java.util.HashMap;

public class HttpTest {
    public static void main(String[] args) {
        String url="http://localhost:8080/post_horse_war/getAllBooks.action";
        HashMap<String,String> hashMap=new HashMap<>();
        String doGet = HttpUtils.doGet(url, hashMap);
        System.out.println(doGet);
    }
}
