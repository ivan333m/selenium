package com.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

//@SpringBootApplication
public class SeleniumApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SeleniumApplication.class, args);
        test();
    }

    private static void test() {
        WebDriver  driver = DriverFactory.create();
        driver.get("http://localhost:8888/test.html");
        WebElement element = driver.findElement(By.id("create-task-users-list"));
        element.click();
        element.sendKeys("user2@mytestapp.com");
        System.out.println("Done");
    }

}
