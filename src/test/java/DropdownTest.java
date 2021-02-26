import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownPage;


import static org.testng.Assert.assertTrue;

public class DropdownTest extends BaseTest {
    @Test
    public void testDropdown() {
        String option1 = "Option 1";
        DropdownPage dropdownPage = homePage.clickDropdown();
        dropdownPage.SelectDropdownOption(option1);
        Assert.assertTrue(dropdownPage.GetSelectedDropdownOption().equals(option1));
    }
}
