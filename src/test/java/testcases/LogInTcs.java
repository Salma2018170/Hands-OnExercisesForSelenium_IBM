package testcases;

import org.testng.annotations.Test;
import setup.Setup;

public class LogInTcs extends Setup {
    @Test
    public void funLoginWithValidData(){
     homePage.funClickOnLogin();
    }
}
