package Practice;

import ReusableLibraries.ReusableAnnotations;
import org.testng.annotations.Test;

public class Own_work extends ReusableAnnotations {
    @Test
    public void myWork(){
        driver.navigate().to("https://www.google.com");
    }//end of test case
}//end of class
