package features;

import org.junit.Test;

public class HeaderNavbar3Test extends BaseTest {


    @Test
    public void headerNavbar3Test() {
        loginSteps.cookieAcceptButton();
        headerNavbar3Steps.headerNavbar3Button();
        headerNavbar3Steps.waitABit(500);
        headerNavbar3Steps.headerNavbar3DropDownListSortBy_A_la_Z();
        headerNavbar3Steps.waitABit(500);
        headerNavbar3Steps.headerNavbar3DropDownListSortBy_Z_la_A();
        headerNavbar3Steps.waitABit(500);
        headerNavbar3Steps.headerNavbar3DropDownListSortBy_Rating();
        headerNavbar3Steps.waitABit(500);
        headerNavbar3Steps.headerNavbar3DropDownListSortBy_Popularity();
        headerNavbar3Steps.waitABit(500);
        headerNavbar3Steps.headerNavbar3DropDownListSortBy_Newest();
        headerNavbar3Steps.waitABit(500);

    }
}
