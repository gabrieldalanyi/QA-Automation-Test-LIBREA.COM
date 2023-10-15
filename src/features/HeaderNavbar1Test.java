package features;

import org.junit.Test;

public class HeaderNavbar1Test extends BaseTest {


    @Test
    public void headerNavbar1Test() {
        loginSteps.cookieAcceptButton();
        headerNavbar1Steps.headerNavbar1Button();
        headerNavbar1Steps.waitABit(500);
        headerNavbar1Steps.headerNavbar1DropDownListSortBy_A_la_Z();
        headerNavbar1Steps.waitABit(500);
        headerNavbar1Steps.headerNavbar1DropDownListSortBy_Z_la_A();
        headerNavbar1Steps.waitABit(500);
        headerNavbar1Steps.headerNavbar1DropDownListSortBy_Rating();
        headerNavbar1Steps.waitABit(500);
        headerNavbar1Steps.headerNavbar1DropDownListSortBy_Popularity();
        headerNavbar1Steps.waitABit(500);
        headerNavbar1Steps.headerNavbar1DropDownListSortBy_Newest();
        headerNavbar1Steps.waitABit(500);


    }

}

