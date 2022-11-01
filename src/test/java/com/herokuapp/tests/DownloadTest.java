package com.herokuapp.tests;

import com.herokuapp.services.DownloadService;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class DownloadTest extends BaseTest {
    private File foundedFile;
    DownloadService downloadService;

    @Test
    public void verifyDownloadTest() throws InterruptedException {
        downloadService = new DownloadService();
        downloadService.downloadFile();

        Thread.sleep(3000);
        boolean isFileInSystem = checkFileInSystem();
        Assert.assertTrue(isFileInSystem, "Downloaded document is not found");
        System.out.println(foundedFile);
        foundedFile.deleteOnExit();
    }

    public boolean checkFileInSystem() {
        String fileNameOnPage = downloadService.checkFile();
        String folderPath = "\\downloadedFiles";
        File folder = new File(System.getProperty("user.dir") + folderPath);
        File[] listOfFiles = folder.listFiles();

        for (File listOfFile : listOfFiles) {
            if (listOfFile.isFile()) {
                String fileName = listOfFile.getName();
//                System.out.println("File " + listOfFile.getName());
                if (fileName.matches(fileNameOnPage)) {
                    foundedFile = new File(fileName);
                    return true;
                }
            }
        }
        return false;
    }

}
