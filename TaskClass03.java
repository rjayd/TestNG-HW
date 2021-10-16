package com.syntax.class03.HW;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Task {
    //fire123 LuffyAndAce!23
    //room123 CakeAndCream!23
    //dragon Dr@!23gon
    //blind Sn!23perB
    WebDriver driver;


    @Test(priority = 1, groups = "smoke")
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test(dependsOnMethods = "openBrowser",priority = 2, groups = "smoke")
    public void validLogin() {
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();
    }
    @Test(priority = 3, groups = "regression")
    public void addingEmployeeMenu(){
        WebElement pim = driver.findElement(By.id("menu_pim_viewPimModule"));
        pim.click();
        WebElement addEmployeeBtn = driver.findElement(By.id("menu_pim_addEmployee"));
        addEmployeeBtn.click();
    }
    @Test(priority = 4, groups = "regression")
    public void addEmployee() throws InterruptedException {
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.click();
        firstName.sendKeys("Firefist");
        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.click();
        lastName.sendKeys("Ace");
        WebElement chckLogin = driver.findElement(By.id("chkLogin"));
        chckLogin.click();
        WebElement userName = driver.findElement(By.id("user_name"));
        userName.click();
        userName.sendKeys("fire123");
        WebElement passwordEmp1 = driver.findElement(By.id("user_password"));
        passwordEmp1.click();
        passwordEmp1.sendKeys("LuffyAndAce!23");
        WebElement repPasswordEmp1 = driver.findElement(By.id("re_password"));
        repPasswordEmp1.click();
        repPasswordEmp1.sendKeys("LuffyAndAce!23");
        WebElement save = driver.findElement(By.id("btnSave"));
        save.click();
        Thread.sleep(3000);
        TakesScreenshot ts = (TakesScreenshot) driver;
        ts.getScreenshotAs(OutputType.FILE);
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(sourceFile,new File("screenshots/HRMS/addingUsers.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        WebElement addEmployeeBtn = driver.findElement(By.id("menu_pim_addEmployee"));
        addEmployeeBtn.click();
    }
    @Test(priority = 5, groups = "regression")
    public void addEmployee2() throws InterruptedException {
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.click();
        firstName.sendKeys("Trafalgar");
        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.click();
        lastName.sendKeys("Law");
        WebElement chckLogin = driver.findElement(By.id("chkLogin"));
        chckLogin.click();
        WebElement userName = driver.findElement(By.id("user_name"));
        userName.click();
        userName.sendKeys("room123");
        WebElement passwordEmp1 = driver.findElement(By.id("user_password"));
        passwordEmp1.click();
        passwordEmp1.sendKeys("CakeAndCream!23");
        WebElement repPasswordEmp1 = driver.findElement(By.id("re_password"));
        repPasswordEmp1.click();
        repPasswordEmp1.sendKeys("CakeAndCream!23");
        WebElement save = driver.findElement(By.id("btnSave"));
        save.click();
        Thread.sleep(3000);
        TakesScreenshot ts = (TakesScreenshot) driver;
        ts.getScreenshotAs(OutputType.FILE);
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(sourceFile,new File("screenshots/HRMS/addingUsers2.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        WebElement addEmployeeBtn = driver.findElement(By.id("menu_pim_addEmployee"));
        addEmployeeBtn.click();
    }
    @Test(priority = 6, groups = "regression")
    public void addEmployee3() throws InterruptedException {
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.click();
        firstName.sendKeys("Natsu");
        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.click();
        lastName.sendKeys("Dragneel");
        WebElement chckLogin = driver.findElement(By.id("chkLogin"));
        chckLogin.click();
        WebElement userName = driver.findElement(By.id("user_name"));
        userName.click();
        userName.sendKeys("dragon");
        WebElement passwordEmp1 = driver.findElement(By.id("user_password"));
        passwordEmp1.click();
        passwordEmp1.sendKeys("Dr@!23gon");
        WebElement repPasswordEmp1 = driver.findElement(By.id("re_password"));
        repPasswordEmp1.click();
        repPasswordEmp1.sendKeys("Dr@!23gon");
        WebElement save = driver.findElement(By.id("btnSave"));
        save.click();
        Thread.sleep(3000);
        TakesScreenshot ts = (TakesScreenshot) driver;
        ts.getScreenshotAs(OutputType.FILE);
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(sourceFile,new File("screenshots/HRMS/addingUsers3.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        WebElement addEmployeeBtn = driver.findElement(By.id("menu_pim_addEmployee"));
        addEmployeeBtn.click();
    }
    @Test(priority = 7, groups = "regression")
    public void addEmployee4() throws InterruptedException {
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.click();
        firstName.sendKeys("Blind");
        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.click();
        lastName.sendKeys("Sniper");
        WebElement chckLogin = driver.findElement(By.id("chkLogin"));
        chckLogin.click();
        WebElement userName = driver.findElement(By.id("user_name"));
        userName.click();
        userName.sendKeys("blind123");
        WebElement passwordEmp1 = driver.findElement(By.id("user_password"));
        passwordEmp1.click();
        passwordEmp1.sendKeys("Sn!23perB");
        WebElement repPasswordEmp1 = driver.findElement(By.id("re_password"));
        repPasswordEmp1.click();
        repPasswordEmp1.sendKeys("Sn!23perB");
        WebElement save = driver.findElement(By.id("btnSave"));
        save.click();
        Thread.sleep(3000);
        TakesScreenshot ts = (TakesScreenshot) driver;
        ts.getScreenshotAs(OutputType.FILE);
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(sourceFile,new File("screenshots/HRMS/addingUsers4.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        WebElement addEmployeeBtn = driver.findElement(By.id("menu_pim_addEmployee"));
        addEmployeeBtn.click();
    }
    @Test(priority = 8, groups = "regression")
    public void addEmployee5() throws InterruptedException {
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.click();
        firstName.sendKeys("Bugs");
        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.click();
        lastName.sendKeys("Bunny");
        WebElement chckLogin = driver.findElement(By.id("chkLogin"));
        chckLogin.click();
        WebElement userName = driver.findElement(By.id("user_name"));
        userName.click();
        userName.sendKeys("bugs123");
        WebElement passwordEmp1 = driver.findElement(By.id("user_password"));
        passwordEmp1.click();
        passwordEmp1.sendKeys("Bugs!23Bunny123");
        WebElement repPasswordEmp1 = driver.findElement(By.id("re_password"));
        repPasswordEmp1.click();
        repPasswordEmp1.sendKeys("Bugs!23Bunny123");
        WebElement save = driver.findElement(By.id("btnSave"));
        save.click();
        Thread.sleep(3000);
        TakesScreenshot ts = (TakesScreenshot) driver;
        ts.getScreenshotAs(OutputType.FILE);
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(sourceFile,new File("screenshots/HRMS/addingUsers5.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }
    @Test(dependsOnMethods = "validLogin",priority = 9)
    public void tearDown(){
        driver.quit();
    }
}
