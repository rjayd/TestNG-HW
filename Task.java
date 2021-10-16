package com.syntax.class02.HW2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task {
    WebDriver driver;

    @BeforeClass
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @Test(priority = 1)
    public void validLogin() {
        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginbtn = driver.findElement(By.id("btnLogin"));
        loginbtn.click();
    }
    @Test(priority = 2)
    public void addEmployee(){
        WebElement pimBtn = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pimBtn.click();
        WebElement pimAddEmpBtn = driver.findElement(By.id("menu_pim_addEmployee"));
        pimAddEmpBtn.click();

        WebElement fullName = driver.findElement(By.xpath("//label[@class='hasTopFieldHelp']"));
        WebElement empID = driver.findElement(By.xpath("//label[@for='employeeId']"));
        WebElement photo = driver.findElement(By.xpath("//label[@for ='photofile']"));

        if(fullName.isDisplayed() && empID.isDisplayed() && photo.isDisplayed() ){
            System.out.println(fullName.getText() +" is displayed");
            System.out.println(empID.getText() +" is displayed");
            System.out.println(photo.getText() +" is displayed");
        }else{
            System.out.println("They are not displayed");
        }
    }
    @Test(priority = 3)
    public void addingInfo() throws InterruptedException {
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("Firefist");
        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Ace");
        WebElement photoFile = driver.findElement(By.xpath("//input[@id ='photofile']"));
        Actions action = new Actions(driver);
        Thread.sleep(2000);
        action.moveToElement(photoFile).click().build().perform();
        Thread.sleep(2000);
        photoFile.sendKeys("C:\\Users\\sarda\\OneDrive\\Desktop\\firefist-ace.jpg");
        Thread.sleep(1000);
        photoFile.submit();
    }
    @Test(priority = 4)
    public void verifyingEmp(){
        WebElement empList = driver.findElement(By.id("menu_pim_viewEmployeeList"));
        empList.click();
        List<WebElement> list = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[3]"));
        for(WebElement lists :list){
            if(lists.getText().equalsIgnoreCase("firefist")){
                System.out.println(lists.getText() + " is verified");
                break;
            } else{
                System.out.println("Employee not verified");
                break;
            }
        }
    }
}
