

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class demo {





    public static void main(String args[]) throws MalformedURLException {
         DesiredCapabilities chromeCapabilities = DesiredCapabilities.chrome();
        chromeCapabilities.setPlatform(Platform.LINUX);
        chromeCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
        WebDriver chrome = new RemoteWebDriver(new URL("http://192.168.19.130:4444/wd/hub/"), chromeCapabilities);

        // run against chrome
        chrome.get("https://www.google.com");
        System.out.println(chrome.getTitle());
        chrome.quit();
    }


}