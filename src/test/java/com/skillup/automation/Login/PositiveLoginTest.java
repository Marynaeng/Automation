package com.skillup.automation.Login;

import com.skillup.automation.Data.ReadFromExcelprovider;
import com.skillup.automation.TestRunner;
import com.skillup.automation.pages.LoginPage;
import com.skillup.automation.pages.WallPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PositiveLoginTest extends TestRunner {

    private LoginPage loginPage;
    private WallPage wallPage;

    @BeforeMethod
    public void before() {
        loginPage = new LoginPage(driver);
        wallPage = new WallPage(driver);
    }

   // @Test
   // public void positiveLogin() {
       // loginPage.open()
              //  .enterEmail("skillauto904@gmail.com")
               // .enterPassword("skillauto904")
               // .clickLoginButton();

       // wallPage.assertIsOnPage("/feed");
   // }
//}




//test for excel

    @Test (dataProvider = "dataLoginFromExcel", dataProviderClass = ReadFromExcelprovider.class)
    public void positiveLogin(String email, String password) {

        loginPage.open()
                .enterEmail(email)
                .enterPassword(password)
                .clickLoginButton();

        wallPage.assertIsOnPage("/feed");
    }
}