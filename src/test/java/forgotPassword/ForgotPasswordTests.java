package forgotPassword;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

public class ForgotPasswordTests extends BaseTests {
    @Test
    public void testRetriavePassword(){
        ForgotPasswordPage forgotPasswordPage=homepage.clickForgotPassword();
        forgotPasswordPage.enterEmail("abdallah@example.com");
       EmailSentPage emailSentPage = forgotPasswordPage.clickRetrievePassword();
       Assert.assertTrue(emailSentPage.getMessage().contains("our e-mail's been sent!"),"Message is incorrect");
    }
}
