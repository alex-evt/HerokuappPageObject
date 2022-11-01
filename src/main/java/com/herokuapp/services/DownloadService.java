package com.herokuapp.services;

import com.herokuapp.pages.DownloadPage;

public class DownloadService {

    private static final String DOWNLOAD_URL = "http://the-internet.herokuapp.com/download";

    DownloadPage downloadPage = new DownloadPage();

    public void downloadFile(){
        downloadPage
                .openPage(DOWNLOAD_URL)
                .clickFileTest1();
    }

    public String checkFile(){
      return  downloadPage.checkFileName();
    }

}
