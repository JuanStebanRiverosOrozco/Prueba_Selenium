import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejercicio_10 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement usuario = driver.findElement(By.id("username"));
        usuario.sendKeys("incorrecto");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Password123");

        WebElement boton = driver.findElement(By.id("submit"));
        boton.click();

        WebElement mensaje = driver.findElement(By.id("error"));

        String textoMensaje = mensaje.getText();

        System.out.println("Mensaje mostrado: " + textoMensaje);

        if (textoMensaje.contains("Your username is invalid")) {
            System.out.println("Prueba exitosa: el inicio de sesión fue rechazado");
        } else {
            System.out.println("Prueba fallida");
        }

        driver.quit();
    }
}
