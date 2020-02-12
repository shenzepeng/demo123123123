package com.example.demo123123123.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class FindUserRequest {
    private String name;
    private Integer page=1;
    private Integer size=10;
}
