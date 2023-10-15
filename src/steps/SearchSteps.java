package steps;

import net.thucydides.core.annotations.Step;

public class SearchSteps extends BaseSteps{

    @Step
    public void searchFieldButton(String value){
        searchPage.clickSearchButtonHomePage();
        searchPage.clickSearchFieldButtonHomePage();
        searchPage.setSearchFieldHomePage(value);
        searchPage.clickSearchFieldButton();
    }
    @Step
    public void blogHoverAndSearchField(String text){
        searchPage.clickBlogHoverAndClickBlogButton();
        searchPage.setBlogSearchField(text);
        searchPage.clickBlogSearchButton();
    }
    @Step
    public void blogHoverAndClickBlogButton(){
        searchPage.clickBlogHoverAndClickBlogButton();
    }
    @Step
    public void blogFormFilterSelectYear(){
        searchPage.clickBlogFormFilterSelectYear();
    }

    @Step
    public void blogFormFilterSorting_A_la_Z() {
        searchPage.clickBlogFormFilterDropDownListSortBy_A_la_Z();
    }
    @Step
    public void blogFormFilterSorting_Z_la_A() {
        searchPage.clickBlogFormFilterDropDownListSortBy_Z_la_A();
    }
    @Step
    public void blogFormFilterSorting_Date_Oldest() {
        searchPage.clickBlogFormFilterDropDownListSortBy_Date_Oldest();
    }
    @Step
    public void blogFormFilterSorting_Date_Newest()  {
        searchPage.clickBlogFormFilterDropDownListSortBy_Date_Newest();
    }
    @Step
    public void blogSearchField(String text){
        searchPage.setBlogSearchField(text);
        searchPage.clickBlogSearchButton();
    }
    @Step
    public void blogSearchArticle(){
        searchPage.clickBlogSearchArticle();
    }

}
