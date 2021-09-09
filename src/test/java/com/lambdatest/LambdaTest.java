package com.lambdatest

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LambdaTest {

   public RemoteWebDriver driver = null;
   String username = "";
   String accessKey = "";

   @BeforeTest
   public void setUp() throws Exception {
       DesiredCapabilities capabilities = new DesiredCapabilities();
       capabilities.setCapability("platform", "Windows 10");
       capabilities.setCapability("browserName", "Chrome");
       capabilities.setCapability("version", "87.0");
       capabilities.setCapability("resolution","1024x768");
       capabilities.setCapability("build", "First Test");
       capabilities.setCapability("name", "Sample Test");
       capabilities.setCapability("network", true);       capabilities.setCapability("visual", true);        capabilities.setCapability("video", true);        capabilities.setCapability("console", true);
       try {
           username = System.getProperty("username");
           accessKey = System.getProperty("accessKey");
           driver= new RemoteWebDriver(new URL("https://"+username+":"+accessKey+"@hub.lambdatest.com/wd/hub"), capabilities);
       } catch (MalformedURLException e) {
           System.out.println("Invalid grid URL");
       }
   }

   @Test(enabled = true)
   public void testScript() throws Exception {
       try {
           driver.get("https://lambdatest.github.io/sample-todo-app/");
           driver.findElement(By.name("li1")).click();
           driver.findElement(By.name("li2")).click();
           driver.findElement(By.id("sampletodotext")).clear();
           driver.findElement(By.id("sampletodotext")).sendKeys("Yey, Let's add it to list");
           driver.findElement(By.id("addbutton")).click();
           driver.quit();
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
   }
}
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
package com.lambdatest
 
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
public class LambdaTest {
 
   public RemoteWebDriver driver = null;
   String username = "";
   String accessKey = "";
 
   @BeforeTest
   public void setUp() throws Exception {
       DesiredCapabilities capabilities = new DesiredCapabilities();
       capabilities.setCapability("platform", "Windows 10");
       capabilities.setCapability("browserName", "Chrome");
       capabilities.setCapability("version", "87.0");
       capabilities.setCapability("resolution","1024x768");
       capabilities.setCapability("build", "First Test");
       capabilities.setCapability("name", "Sample Test");
       capabilities.setCapability("network", true);       capabilities.setCapability("visual", true);        capabilities.setCapability("video", true);        capabilities.setCapability("console", true);
       try {
           username = System.getProperty("username");
           accessKey = System.getProperty("accessKey");
           driver= new RemoteWebDriver(new URL("https://"+username+":"+accessKey+"@hub.lambdatest.com/wd/hub"), capabilities);
       } catch (MalformedURLException e) {
           System.out.println("Invalid grid URL");
       }
   }
 
   @Test(enabled = true)
   public void testScript() throws Exception {
       try {
           driver.get("https://lambdatest.github.io/sample-todo-app/");
           driver.findElement(By.name("li1")).click();
           driver.findElement(By.name("li2")).click();
           driver.findElement(By.id("sampletodotext")).clear();
           driver.findElement(By.id("sampletodotext")).sendKeys("Yey, Let's add it to list");
           driver.findElement(By.id("addbutton")).click();
           driver.quit();
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
   }
}
