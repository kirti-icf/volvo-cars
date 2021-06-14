import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class FirstTest extends BaseTest {

    @Test
    public void verifyNavigationTitle() {
        System.out.println("Google1 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        getDriver().navigate().to("https://www.volvocars.com/intl/v/car-safety/a-million-more");
        System.out.println("Google1 Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: " +  Thread.currentThread().getId());
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id=\"site-nav-topbar-wrapper\"]/nav/div[1]/a/img")).isDisplayed());
        getDriver().findElement(By.xpath("//*[@id=\"site-nav-topbar-wrapper\"]/nav/div[1]/a/img")).click();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("https://www.volvocars.com/intl"));
    }

    @Test
    public void verifyHamburgerMenu() {
//        System.out.println("Google1 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        getDriver().navigate().to("https://www.volvocars.com/intl/v/car-safety/a-million-more");
//        System.out.println("Google1 Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: " +  Thread.currentThread().getId());
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id=\"sitenav-v2-sidenav-toggle\"]")).isDisplayed());
        getDriver().findElement(By.xpath("//*[@id=\"sitenav-v2-sidenav-toggle\"]")).sendKeys(Keys.ENTER);
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id=\"nav:sideNavigation\"]/div[2]/div[1]/div[1]/a")).isDisplayed());
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id=\"nav:sideNavigation\"]/div[2]/div[2]/div/div/div[1]/div[2]/button[1]/em")).isDisplayed());
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id=\"nav:sideNavigation\"]/div[2]/div[2]/div/div/div[1]/div[2]/button[2]")).getText().contains("Own"));
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id=\"nav:sideNavigation\"]/div[2]/div[2]/div/div/div[1]/div[2]/button[3]")).getText().contains("Why Volvo"));
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id=\"nav:sideNavigation\"]/div[2]/div[2]/div/div/div[1]/div[2]/button[4]")).getText().contains("Explore"));
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id=\"nav:sideNavigation\"]/div[2]/div[2]/div/div/div[1]/div[2]/button[5]")).getText().contains("More"));
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id=\"nav:sideNavigation\"]/div[2]/div[2]/div/div/div[1]/button/div/p")).getText().contains("International"));
        getDriver().findElement(By.xpath("//*[@id=\"nav:sideNavigation\"]/div[2]/div[1]/div[2]/button")).sendKeys(Keys.ENTER);


    }
    @Test
    public void verifyModelIntro() {
//        System.out.println("Google1 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        getDriver().navigate().to("https://www.volvocars.com/intl/v/car-safety/a-million-more");
//        System.out.println("Google1 Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: " +  Thread.currentThread().getId());
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id=\"TextStatement-1\"]/section/div/div/p")).isDisplayed());
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id=\"ModelIntro-1\"]/section/h2")).getText().contains("Ideas that change the world are often the most controversial."));


    }


    @Test
    public void verifyModelDetails() {
//        System.out.println("Google1 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        getDriver().navigate().to("https://www.volvocars.com/intl/v/car-safety/a-million-more");
//        System.out.println("Google1 Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: " +  Thread.currentThread().getId());
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id=\"ModelIntro-1\"]/section/p")).isDisplayed());
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id=\"ModelIntro-1\"]/section/p")).getText().contains("After we introduced the 3-point safety belt, we faced a world of criticism. Since then, it has saved more than a million lives. Now it's time for the next step. For everyone's safety."));

    }


    @Test
    public void verifySideNavigationBar() {
        System.out.println("Google1 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        getDriver().navigate().to("https://www.volvocars.com/intl/v/car-safety/a-million-more");
        System.out.println("Google1 Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: " +  Thread.currentThread().getId());
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id=\"nav:topNavCarMenu\"]/em/span")).isDisplayed());
        getDriver().findElement(By.xpath("//*[@id=\"nav:topNavCarMenu\"]")).sendKeys(Keys.ENTER);
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id=\"vcc-site-nav\"]/div/div/div[1]/div/div[1]/div")).isEnabled());

    }


    @Test
    public void verifyTextStatement() {
        System.out.println("Google1 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        getDriver().navigate().to("https://www.volvocars.com/intl/v/car-safety/a-million-more");
        System.out.println("Google1 Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: " +  Thread.currentThread().getId());
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id=\"TextStatement-1\"]/section/div/div/p/span[2]")).isDisplayed());
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id=\"TextStatement-1\"]/section/div/div/p/span[2]")).getText().contains("With new and existing safety features, we are determined to save a million more lives."));

    }



    @Test
    public void verifyCallOutsIcon() {
        getDriver().navigate().to("https://www.volvocars.com/intl/v/car-safety/a-million-more");
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id=\"IconCallouts-1\"]/section/div/div[1]/div[1]/div[1]")).isDisplayed());
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id=\"IconCallouts-1\"]/section/div/div[1]/div[2]/div[1]")).isDisplayed());
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id=\"IconCallouts-1\"]/section/div/div[1]/div[3]/div[1]")).isDisplayed());
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id=\"IconCallouts-1\"]/section/div/div[1]/div[4]/div[1]")).isDisplayed());

    }

    @Test
    public void verifyCallOutsSectionText() {
        getDriver().navigate().to("https://www.volvocars.com/intl/v/car-safety/a-million-more");
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id=\"IconCallouts-1\"]/section/div/div[1]/div[1]/div[1]")).isDisplayed());
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id=\"IconCallouts-1\"]/section/div/div[1]/div[1]/div[2]/div/p"))
            .getText().contains("To send a strong signal about the dangers of speeding, we reduced the top speed of all our new cars to 180 km/h in 2020. We are also looking at how smart speed control and geofencing technology could automatically limit speeds near schools and hospitals in the future."));
    }


    @Test
    public void verifyCallOutsSectionCTA() {
        getDriver().navigate().to("https://www.volvocars.com/intl/v/car-safety/a-million-more");
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id=\"IconCallouts-1\"]/section/div/div[2]/div/a")).isDisplayed());
        getDriver().findElement(By.xpath("//*[@id=\"IconCallouts-1\"]/section/div/div[2]/div/a")).sendKeys(Keys.ENTER);
        Assert.assertTrue(getDriver().getCurrentUrl().contains("https://www.volvocars.com/intl/v/car-safety"));

    }

    @Test
    public void verifyCallOutsSectionVideo() {  // similar tests for other videos as well

        getDriver().navigate().to("https://www.volvocars.com/intl/v/car-safety/a-million-more");
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id=\"VideoTestimonials-1\"]/section/div/div[2]/div[1]")).isDisplayed());
        getDriver().findElement(By.xpath("//*[@id=\"VideoTestimonials-1\"]/section/div/div[2]/div[1]")).getAttribute("src");


    }

    @Test
    public void verifyProductListCarousel() {
        getDriver().navigate().to("https://www.volvocars.com/intl/v/car-safety/a-million-more");
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id=\"ProductListCarousel-1\"]/section/div[1]/div/div/div")).isDisplayed());
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id=\"IconCallouts-1\"]/section/div/div[2]/div/a")).isDisplayed());
        getDriver().findElement(By.xpath("//*[@id=\"IconCallouts-1\"]/section/div/div[2]/div/a")).sendKeys(Keys.ENTER);
//        Assert.assertTrue(getDriver().getCurrentUrl().contains("https://www.volvocars.com/intl/v/cars/xc90-hybrid")); // assertion is failing
        getDriver().findElement(By.xpath("//*[@id=\"ProductListCarousel-1\"]/section/div[1]/div/div/div/div[1]/div[1]/div/div/div/div[1]/div/div/div[1]/a")).sendKeys(Keys.ENTER);
        Assert.assertTrue(getDriver().getCurrentUrl().contains("https://www.volvocars.com/intl/v/cars/xc90-hybrid"));
        getDriver().findElement(By.xpath("//*[@id=\"ProductListCarousel-1\"]/section/div[1]/div/div/div/div[1]/div[1]/div/div/div/div[1]/div/div/div[2]/a")).sendKeys(Keys.ENTER);
        Assert.assertTrue(getDriver().getCurrentUrl().contains("https://www.volvocars.com/intl/build/xc90-hybrid"));



    }

}

// Could have add more scenarios but due to time constrains added few major ones.