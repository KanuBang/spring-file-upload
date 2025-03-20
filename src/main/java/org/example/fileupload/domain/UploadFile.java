package org.example.fileupload.domain;

import lombok.Data;

@Data
public class UploadFile {

    private String uploadFileName;
    private String storeFileName;

    public UploadFile(String uploadFile, String storeFileName) {
        this.uploadFileName = uploadFile;
        this.storeFileName = storeFileName;
    }
}
