package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebBrowser {
    private static WebDriver webDriver;
    private static String webTitle;
    public static void getChromeBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\44738\\IdeaProjects\\AutomationTests\\resources\\browser\\chromedriver.exe");
        webDriver = new ChromeDriver(); // get chrome browser
        webDriver.manage().window().maximize(); // maximize the window
    }

    public static void openURL(String url){
        webDriver.get(url);
        webTitle = webDriver.getTitle();
        System.out.println("Opened : "+ webTitle);
    }

    public static void closeChromeBrowser(){
        webDriver.quit();
    }
}
