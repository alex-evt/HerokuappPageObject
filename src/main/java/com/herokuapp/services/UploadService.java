package com.herokuapp.services;

import com.herokuapp.pages.UploadPage;

public class UploadService {

    private static final String UPLOAD_URL = "http://the-internet.herokuapp.com/upload";
    private static final String CAT_IMAGE = "C:\\Users\\Alex\\IdeaProjects\\HerokuappPageObject\\src\\main\\java\\com\\herokuapp\\model\\MrCat.webp";


    UploadPage uploadPage = new UploadPage();

    public void upload() {
        uploadPage
                .openPage(UPLOAD_URL)
                .uploadFile(CAT_IMAGE);
    }

    public String checkUploadedFileName() {
        return uploadPage
                .clickSubmitFileButton()
                .uploadedFilesName();
    }
}
