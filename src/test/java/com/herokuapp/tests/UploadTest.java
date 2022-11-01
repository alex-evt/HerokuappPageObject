package com.herokuapp.tests;

import com.herokuapp.services.UploadService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadTest extends BaseTest{

    UploadService uploadService;

    @Test
    public void verifyUploadedFileNameOnPage(){
        uploadService = new UploadService();

        uploadService.upload();
        String actualNameOfUploadedFile = uploadService.checkUploadedFileName();
        String expectedNameOfUploadedFile = "MrCat.webp";
        Assert.assertEquals(actualNameOfUploadedFile, expectedNameOfUploadedFile);
    }

}
