import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//THIS IS THE (Page Object) CLASS WHICH CONTAIN ALL METHOD DECLARATION ARE THERE

public class FacebookLoginPO {
    WebDriver driver;

    FacebookLoginPO(WebDriver driver){
        this.driver=driver;
    }

    //Navigate to url
    public void navigatetoURL(){
        driver.get("https://www.facebook.com/login/");
    }

    By email = By.xpath("//input[@placeholder=\"Email address or phone number\"]");

    public void setEmailId(){
       WebElement mail = driver.findElement(email);
       mail.click();
       mail.sendKeys("noor813@gmial.com");
    }

    By password = By.xpath("//input[@id=\"pass\"]");

    public void setPassword(){
        WebElement pass = driver.findElement(password);
        pass.sendKeys("3434343");
    }

    By login_btn = By.xpath("//button[@type=\"submit\"]");

    public void setLogin_btn(){
        WebElement lngbtn = driver.findElement(login_btn);
    }


}
