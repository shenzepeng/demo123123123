package com.example.demo123123123.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

@RestController
public class FileController {
    @PostMapping
    public Object addFile(MultipartFile multipartFile) throws IOException {
        //1.通过MultipartFile拿到流
        InputStream inputStream = multipartFile.getInputStream();
        //2.将这个流保存到内存中

        //3.将内存中的buffer转换为File

        //4.将file保存到磁盘上
        return null;
    }
}
