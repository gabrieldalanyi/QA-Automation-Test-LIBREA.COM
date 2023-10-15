package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class HeaderNavbar1Page extends BasePage {

    @FindBy(css = "#header > div > div > nav > ul > li:nth-child(1) > a")
    private WebElementFacade headerNavbar1Button;

    @FindBy(css = "#order_by > option:nth-child(2)")
    private WebElementFacade headerNavbar1DropDownListSortBy_A_la_Z;

    @FindBy(css = "#order_by > option:nth-child(3)")
    private WebElementFacade headerNavbar1DropDownListSortBy_Z_la_A;

    @FindBy(css = "#order_by > option:nth-child(4)")
    private WebElementFacade headerNavbar1DropDownListSortBy_Rating;

    @FindBy(css = "#order_by > option:nth-child(5)")
    private WebElementFacade headerNavbar1DropDownListSortBy_Popularity;

    @FindBy(css = "#order_by > option:nth-child(6)")
    private WebElementFacade headerNavbar1DropDownListSortBy_Newest;



    public void clickHeaderNavbar1Button() {clickOn(headerNavbar1Button);}

    public void clickHeaderNavbar1DropDownListSortBy_A_la_Z() {clickOn(headerNavbar1DropDownListSortBy_A_la_Z);}

    public void clickHeaderNavbar1DropDownListSortBy_Z_la_A() {clickOn(headerNavbar1DropDownListSortBy_Z_la_A);}

    public void clickHeaderNavbar1DropDownListSortBy_Rating() {clickOn(headerNavbar1DropDownListSortBy_Rating);}

    public void clickHeaderNavbar1DropDownListSortBy_Popularity() {clickOn(headerNavbar1DropDownListSortBy_Popularity);}

    public void clickHeaderNavbar1DropDownListSortBy_Newest() {clickOn(headerNavbar1DropDownListSortBy_Newest);}



}
