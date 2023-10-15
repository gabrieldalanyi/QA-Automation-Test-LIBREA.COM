package steps;

import net.thucydides.core.annotations.Step;


public class HeaderNavbar2Steps extends BaseSteps{

    @Step
    public void headerNavbar2Button() {
        headerNavbar2Page.clickHeaderNavbar2Button();}

    @Step
    public void headerNavbar2DropDownListSortBy_A_la_Z() {
        headerNavbar2Page.clickHeaderNavbar2DropDownListSortBy_A_la_Z();}

    @Step
    public void headerNavbar2DropDownListSortBy_Z_la_A() {
        headerNavbar2Page.clickHeaderNavbar2DropDownListSortBy_Z_la_A();}

    @Step
    public void headerNavbar2DropDownListSortBy_Rating() {
        headerNavbar2Page.clickHeaderNavbar2DropDownListSortBy_Rating();}

    @Step
    public void headerNavbar2DropDownListSortBy_Popularity() {
        headerNavbar2Page.clickHeaderNavbar2DropDownListSortBy_Popularity();}

    @Step
    public void headerNavbar2DropDownListSortBy_Newest() {
        headerNavbar2Page.clickHeaderNavbar2DropDownListSortBy_Newest();}





}
