package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class HeaderNavbar2Page extends BasePage{

    @FindBy(css = "#header > div > div > nav > ul > li:nth-child(2) > a")
    private WebElementFacade headerNavbar2Button;

    @FindBy(css = "#order_by > option:nth-child(2)")
    private WebElementFacade headerNavbar2DropDownListSortBy_A_la_Z;

    @FindBy(css = "#order_by > option:nth-child(3)")
    private WebElementFacade headerNavbar2DropDownListSortBy_Z_la_A;

    @FindBy(css = "#order_by > option:nth-child(4)")
    private WebElementFacade headerNavbar2DropDownListSortBy_Rating;

    @FindBy(css = "#order_by > option:nth-child(5)")
    private WebElementFacade headerNavbar2DropDownListSortBy_Popularity;

    @FindBy(css = "#order_by > option:nth-child(6)")
    private WebElementFacade headerNavbar2DropDownListSortBy_Newest;



    public void clickHeaderNavbar2Button() {clickOn(headerNavbar2Button);}

    public void clickHeaderNavbar2DropDownListSortBy_A_la_Z() {clickOn(headerNavbar2DropDownListSortBy_A_la_Z);}

    public void clickHeaderNavbar2DropDownListSortBy_Z_la_A() {clickOn(headerNavbar2DropDownListSortBy_Z_la_A);}

    public void clickHeaderNavbar2DropDownListSortBy_Rating() {clickOn(headerNavbar2DropDownListSortBy_Rating);}

    public void clickHeaderNavbar2DropDownListSortBy_Popularity() {clickOn(headerNavbar2DropDownListSortBy_Popularity);}

    public void clickHeaderNavbar2DropDownListSortBy_Newest() {clickOn(headerNavbar2DropDownListSortBy_Newest);}




}
