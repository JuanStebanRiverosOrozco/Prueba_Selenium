import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args){
       /* WebDriver dr = new ChromeDriver();
        dr.get("https://practicetestautomation.com/practice-test-login/");
        WebElement inName  = dr.findElement(By.id("username"));
        inName.sendKeys("student");
        WebElement inPass = dr.findElement(By.id("password"));
        inPass.sendKeys("Password123");
        WebElement button = dr.findElement(By.id("submit"));
        button.click();

       // WebElement resultado = dr.findElement(By.id("h1"));
       // String resultado1 = resultado.getText();

        // String resulatado =dr.findElement(By.tagName("h1")).getText();
        String url = dr.getCurrentUrl();
        System.out.println(url);
        if (url.equals("https://practicetestautomation.com/logged-in-successfully/")){
            System.out.println("La prueba fue exitosa");
        }
        else{
            System.out.println("La prueba fue fallida");
        }*/
        /*//apertura del navegador
        WebDriver driver = new ChromeDriver();
        //generar  la espera explicita
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.get("https://the-internet.herokuapp.com/inputs");
            WebElement elemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("input")));
            elemento.sendKeys("15");
        }finally {
            driver.quit();
        }*/

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));

        try {
            driver.get("https://www.wikipedia.org/");
            driver.manage().window().maximize();

            WebElement inputBusqueda = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("search")));

            inputBusqueda.sendKeys("selenium");
            inputBusqueda.sendKeys(Keys.ENTER);

            String encabezado = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstHeading"))).getText();

            System.out.println("El encabezado es: "+ encabezado);

            if(encabezado.toLowerCase().contains("selenium")) {
                System.out.println("Paso la prueba");
            }else{
                System.out.println("No paso la prueba");
            }
            
        }finally {
            driver.quit();
        }


    }

}