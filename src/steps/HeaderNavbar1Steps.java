package steps;
import net.thucydides.core.annotations.Step;

public class HeaderNavbar1Steps extends BaseSteps {

    @Step
    public void headerNavbar1Button() {
        headerNavbar1Page.clickHeaderNavbar1Button();}

    @Step
    public void headerNavbar1DropDownListSortBy_A_la_Z() {
        headerNavbar1Page.clickHeaderNavbar1DropDownListSortBy_A_la_Z();}

    @Step
    public void headerNavbar1DropDownListSortBy_Z_la_A() {
        headerNavbar1Page.clickHeaderNavbar1DropDownListSortBy_Z_la_A();}

    @Step
    public void headerNavbar1DropDownListSortBy_Rating() {
        headerNavbar1Page.clickHeaderNavbar1DropDownListSortBy_Rating();}

    @Step
    public void headerNavbar1DropDownListSortBy_Popularity() {
        headerNavbar1Page.clickHeaderNavbar1DropDownListSortBy_Popularity();}

    @Step
    public void headerNavbar1DropDownListSortBy_Newest() {
        headerNavbar1Page.clickHeaderNavbar1DropDownListSortBy_Newest();}


}

