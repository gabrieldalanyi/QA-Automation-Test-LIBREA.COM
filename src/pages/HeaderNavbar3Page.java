package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class HeaderNavbar3Page extends BasePage{


    @FindBy(css = "#header > div > div > nav > ul > li:nth-child(3) > a")
    private WebElementFacade headerNavbar3Button;

    @FindBy(css = "#order_by > option:nth-child(2)")
    private WebElementFacade headerNavbar3DropDownListSortBy_A_la_Z;

    @FindBy(css = "#order_by > option:nth-child(3)")
    private WebElementFacade headerNavbar3DropDownListSortBy_Z_la_A;

    @FindBy(css = "#order_by > option:nth-child(4)")
    private WebElementFacade headerNavbar3DropDownListSortBy_Rating;

    @FindBy(css = "#order_by > option:nth-child(5)")
    private WebElementFacade headerNavbar3DropDownListSortBy_Popularity;

    @FindBy(css = "#order_by > option:nth-child(6)")
    private WebElementFacade headerNavbar3DropDownListSortBy_Newest;


    public void clickHeaderNavbar3Button() {
        clickOn(headerNavbar3Button);
    }

    public void clickHeaderNavbar3DropDownListSortBy_A_la_Z() {clickOn(headerNavbar3DropDownListSortBy_A_la_Z);}

    public void clickHeaderNavbar3DropDownListSortBy_Z_la_A() {clickOn(headerNavbar3DropDownListSortBy_Z_la_A);}

    public void clickHeaderNavbar3DropDownListSortBy_Rating() {clickOn(headerNavbar3DropDownListSortBy_Rating);}

    public void clickHeaderNavbar3DropDownListSortBy_Popularity() {clickOn(headerNavbar3DropDownListSortBy_Popularity);}

    public void clickHeaderNavbar3DropDownListSortBy_Newest() {clickOn(headerNavbar3DropDownListSortBy_Newest);}

}
