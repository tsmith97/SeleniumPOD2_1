/**
 * Created by TXS0403 on 6/27/2017.
 */
public class HomePage extends SeleniumUtils {
    public static final String SEARCH_BOX = ".//input[@id='headerSearch']";

    public boolean validateSearchBox(){
        if(waitUntilElementDisplayed(SEARCH_BOX)){
            return true;
        }
        return false;
    }


}
