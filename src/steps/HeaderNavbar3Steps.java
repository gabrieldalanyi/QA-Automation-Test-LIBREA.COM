package steps;

import net.thucydides.core.annotations.Step;

public class HeaderNavbar3Steps extends BaseSteps{

    @Step
    public void headerNavbar3Button() {
        headerNavbar3Page.clickHeaderNavbar3Button();}

    @Step
    public void headerNavbar3DropDownListSortBy_A_la_Z() {
        headerNavbar3Page.clickHeaderNavbar3DropDownListSortBy_A_la_Z();}

    @Step
    public void headerNavbar3DropDownListSortBy_Z_la_A() {
        headerNavbar3Page.clickHeaderNavbar3DropDownListSortBy_Z_la_A();}

    @Step
    public void headerNavbar3DropDownListSortBy_Rating() {
        headerNavbar3Page.clickHeaderNavbar3DropDownListSortBy_Rating();}

    @Step
    public void headerNavbar3DropDownListSortBy_Popularity() {
        headerNavbar3Page.clickHeaderNavbar3DropDownListSortBy_Popularity();}

    @Step
    public void headerNavbar3DropDownListSortBy_Newest() {
        headerNavbar3Page.clickHeaderNavbar3DropDownListSortBy_Newest();}

}
