package com.upload.model;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Oleg Romanenchuk on 9/2/2015.
 */
public class File {
    MultipartFile file;

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
