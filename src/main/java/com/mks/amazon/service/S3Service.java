package com.mks.amazon.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface S3Service {

    void upload(MultipartFile multipartFile) throws IOException;


    byte[] downloadFile(String fileName);
}
