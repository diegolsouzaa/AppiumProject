package br.com.AppiumProject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class FormularioTest {


    public void instalarApp() throws MalformedURLException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("plataformName", "Android");
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("automationName","uiautomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "/home/s2it_dsouza/workspace/AppiumProject/src/main/resources/CTAppium-1-1.apk");

        AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),desiredCapabilities);

        driver.quit();
    }
}
