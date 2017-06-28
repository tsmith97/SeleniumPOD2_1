import org.junit.Assert;
import org.junit.Test;

import java.net.URL;

/**
 * Created by TXS0403 on 6/27/2017.
 */
public class MainTest {
    //SeleniumUtils utils = new SeleniumUtils(); //1st Class created
    HomePage utils = new HomePage(); //Next Class Created After MainTest

    public static final String URL = "http://homedepot.com";
    @Test
    public void startTestHere(){
        //Step 1a
        Assert.assertTrue("Unable to navigate to home page.", utils.navigateURL(URL));
        System.out.println("Navigated to: " + URL);

        //Step 1b
        Assert.assertTrue("Search box not displayed", utils.validateSearchBox());
        System.out.println("Search box is displayed");

        //Step 2

        //Step 3
    }

}
