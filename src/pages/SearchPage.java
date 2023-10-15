package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.interactions.Actions;


public class SearchPage extends PageObject {

 @FindBy(css="#searchDropdown")
 private WebElementFacade searchButtonHomePage;

 @FindBy(css=".form-control")
 private WebElementFacade searchFieldHomePage;

 @FindBy(css=".search-button")
 private WebElementFacade searchFieldButtonHomePage;

 @FindBy(css=".button.button--secondary")
 private WebElementFacade searchFieldButton;

 @FindBy(css=".menu-main [data-link=\"/blog\"]")
 private WebElementFacade headerBlogButton;

 @FindBy(css="#header > div > div > nav > ul > li:nth-child(6) > div > ul > li:nth-child(2) > a")
 private WebElementFacade blogButton;

 @FindBy(css=".form-filters.js-blog-filters [type=\"text\"]")
 private WebElementFacade blogSearchField;

 @FindBy(css=".filter-bar .button--tertiary")
 private WebElementFacade blogSearchButton;

 @FindBy(css="body > main > section.pt-3 > div > div.filter-bar > form > select:nth-child(2) > option:nth-child(2)")
 private WebElementFacade blogFormFilterSelectYear;

 @FindBy(css = "body > main > section.pt-3 > div > div.filter-bar > form > select:nth-child(3) > option:nth-child(2)")
 private WebElementFacade blogFormFilterDropDownListSortBy_A_la_Z;

 @FindBy(css = "body > main > section.pt-3 > div > div.filter-bar > form > select:nth-child(3) > option:nth-child(3)")
 private WebElementFacade blogFormFilterDropDownListSortBy_Z_la_A;

 @FindBy(css = "body > main > section.pt-3 > div > div.filter-bar > form > select:nth-child(3) > option:nth-child(4)")
 private WebElementFacade blogFormFilterDropDownListSortBy_Date_Oldest;

 @FindBy(css = "body > main > section.pt-3 > div > div.filter-bar > form > select:nth-child(3) > option:nth-child(5)")
 private WebElementFacade blogFormFilterDropDownListSortBy_Date_Newest;

 @FindBy(css = "body > main > section.pt-3 > div > div.row > article > div > a.blog-thumbnail > h2")
 private WebElementFacade blogSearchArticle;



 public void clickSearchButtonHomePage(){clickOn(searchButtonHomePage);}

 public void setSearchFieldHomePage(String value){typeInto(searchFieldHomePage,value);}

 public void clickSearchFieldButtonHomePage(){
  clickOn(searchFieldButtonHomePage);
 }

 public void clickSearchFieldButton(){
  clickOn(searchFieldButton);
 }

 public void clickBlogHoverAndClickBlogButton(){
  Actions actions = new Actions(getDriver());
  actions.moveToElement(headerBlogButton).build().perform();
  clickOn(blogButton);
 }
 public void setBlogSearchField(String text){typeInto(blogSearchField,text);}

 public void clickBlogSearchButton(){
  clickOn(blogSearchButton);
}

 public void clickBlogFormFilterSelectYear(){
  clickOn(blogFormFilterSelectYear);
 }

 public void clickBlogFormFilterDropDownListSortBy_A_la_Z(){
  clickOn(blogFormFilterDropDownListSortBy_A_la_Z);
 }

 public void clickBlogFormFilterDropDownListSortBy_Z_la_A(){
  clickOn(blogFormFilterDropDownListSortBy_Z_la_A);
 }

 public void clickBlogFormFilterDropDownListSortBy_Date_Oldest(){clickOn(blogFormFilterDropDownListSortBy_Date_Oldest);}

 public void clickBlogFormFilterDropDownListSortBy_Date_Newest(){clickOn(blogFormFilterDropDownListSortBy_Date_Newest);}

 public void clickBlogSearchArticle(){clickOn(blogSearchArticle);}







}
