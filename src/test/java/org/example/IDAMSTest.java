package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class IDAMSTest {

    @BeforeAll
    public void openApplication(){
        WebBrowser.getChromeBrowser();
        WebBrowser.openURL("https://admin.stage.idams.awtg.co.uk/");
    }

    @AfterAll
    public void closeBrowser(){
        WebBrowser.closeChromeBrowser();
    }

    @Test
    public void getAppURL(){

    }

}
