/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unipampa.tests.evidenceerror;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author YURY
 */
public class TestingSupport {

    public static boolean saveScreenshotError(WebDriver driver, String path, String nameTestCase) throws Exception {
        try {
            File diretorio = new File(path, nameTestCase + " - Fail");
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            diretorio.mkdirs();
            FileUtils.copyFileToDirectory(screenshot, diretorio);

            return true;
        } catch (Exception e) {

            return false;
        }
    }
}
