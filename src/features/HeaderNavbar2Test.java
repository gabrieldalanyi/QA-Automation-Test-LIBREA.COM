package features;

import org.junit.Test;

public class HeaderNavbar2Test extends BaseTest {

    @Test
    public void headerNavbar2Test() {
    loginSteps.cookieAcceptButton();
    headerNavbar2Steps.headerNavbar2Button();
    headerNavbar2Steps.waitABit(500);
    headerNavbar2Steps.headerNavbar2DropDownListSortBy_A_la_Z();
    headerNavbar2Steps.waitABit(500);
    headerNavbar2Steps.headerNavbar2DropDownListSortBy_Z_la_A();
    headerNavbar2Steps.waitABit(500);
    headerNavbar2Steps.headerNavbar2DropDownListSortBy_Rating();
    headerNavbar2Steps.waitABit(500);
    headerNavbar2Steps.headerNavbar2DropDownListSortBy_Popularity();
    headerNavbar2Steps.waitABit(500);
    headerNavbar2Steps.headerNavbar2DropDownListSortBy_Newest();
    headerNavbar2Steps.waitABit(500);
    }





}
