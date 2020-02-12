package com.example.demo123123123.model;

import java.util.Date;

public class FileModel {
    private Long id;
    private String path;
    private Long size;
    private String type;
    /**
     * fileName=serverId+time+type
     */
    private String fileName;
    private Date createTime;
    private Date expiredTime;

}
