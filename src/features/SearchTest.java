package features;

import org.junit.Test;

public class SearchTest extends BaseTest{

    @Test
    public void searchTestOnHomePage(){
        loginSteps.cookieAcceptButton();
        searchSteps.searchFieldButton("apple");
        searchSteps.searchFieldButton("as");
        searchSteps.searchFieldButton("1fsaf234fasfasf5325y4hujnfsdeadsh=-DGHFTFHRTF09876543");
        searchSteps.searchFieldButton("12345");
        searchSteps.searchFieldButton("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        searchSteps.searchFieldButton("lib");
        searchSteps.searchFieldButton("CHIL");
        searchSteps.searchFieldButton("set ");
        searchSteps.searchFieldButton("absot");
        searchSteps.searchFieldButton("QWERTYUIOPASDFGHJKLZXCVBNMPOIUYTREASDFGHJKLMNBVCXXZ");
        searchSteps.searchFieldButton("SPcpwsOJblb6UrKxPIRs2xsJlaeKF5R95rTFrmXKuJPlWbyH477Y6Uy37BRdpb0yW4BdE4IgK1lVYp9ezFkpjwiQiH2yP");
        searchSteps.searchFieldButton("99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999");
        searchSteps.searchFieldButton("158964496031748712961398805988527861544691831997869585435547323502956558648461847524120487129693");
        searchSteps.searchFieldButton("hz8ahgpcc8nnrje2sctakaubj3fuk2b2ab4uijed27l7rmz688ebcjv23hwls8t1wmfb543ra8ysqghqcu9xx51i4b6bnic0");
        searchSteps.searchFieldButton("UJ7SVY37QZ3PU797HD74IH3JLGUJQALS6GVQGIKXADBIGFP2L480G7PKIMGHLXRBZ9BOEOW3GDTICKB8MAAPJLL9Q71AMQSL");
        searchSteps.searchFieldButton("RAilbAPgd9KGl1zZcAHPPQvz1AWE7BbK5wwxllMKuqCPLgkZKywprAK5Kskga27x85J7egjI9cPY1rixjPrIQa4YcMOVUhUC8qF");
        searchSteps.searchFieldButton("$%&$%**#*^^%&%^$$#^^%%^^*$&*^*$&#&*$*$*%##$#&#%**$$^&$#&&^##&^^$#^^^%*#**$$&%&^#%&^%*$#&%*&$&%*^#^#");
        searchSteps.searchFieldButton("! @#$%^&*()_+}{|\":?><\\';'\\][=-");
        searchSteps.waitABit(5000);

    }
  @Test

     public void blogPageSearchTest(){
      loginSteps.cookieAcceptButton();
      searchSteps.blogHoverAndSearchField("1fsaf234fasfasf5325y4hujnfsdeadsh=-DGHFTFHRTF09876543");
      searchSteps.blogHoverAndSearchField("regesthhtj");
      searchSteps.blogHoverAndSearchField("");
      searchSteps.blogHoverAndSearchField("apple");
      searchSteps.blogHoverAndSearchField("as");
      searchSteps.blogHoverAndSearchField("1fsaf234fasfasf5325y4hujnfsdeadsh=-DGHFTFHRTF09876543");
      searchSteps.blogHoverAndSearchField("12345");
      searchSteps.blogHoverAndSearchField("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
      searchSteps.blogHoverAndSearchField("lib");
      searchSteps.blogHoverAndSearchField("LOȚII");
      searchSteps.blogHoverAndSearchField("drfgadrd");
      searchSteps.blogHoverAndSearchField("absorba");
      searchSteps.blogHoverAndSearchField("QWERTYUIOPASDFGHJKLZXCVBNMPOIUYTREASDFGHJKLMNBVCXXZ");
      searchSteps.blogHoverAndSearchField("SPcpwsOJblb6UrKxPIRs2xsJlaeKF5R95rTFrmXKuJPlWbyH477Y6Uy37BRdpb0yW4BdE4IgK1lVYp9ezFkpjwiQiH2");
      searchSteps.blogHoverAndSearchField("999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999");
      searchSteps.blogHoverAndSearchField("1589644960317487129613988059885278615446918319978695854355473235029565586484618475241204871");
      searchSteps.blogHoverAndSearchField("hz8ahgpcc8nnrje2sctakaubj3fuk2b2ab4uijed27l7rmz688ebcjv23hwls8t1wmfb543ra8ysqghqcu9xx51i4b6b");
      searchSteps.blogHoverAndSearchField("6X7YPURH77QPBER920JQST06UV3SXMTBB42V73QMHBGRG0WN72XH42M1ASYR9Z1NEE11Y5RB9LQYZYPHXXR6M7ITSLU");
      searchSteps.blogHoverAndSearchField("93JSOLuJ3s4oLDZ5itZ5S6yhDNEtK5x80oxQWi02E0X0qabqNq9hjlGucXQmjIOudP7uRFD1OqDgtM8TIbJDQzu0tChht");
      searchSteps.blogHoverAndSearchField("%^&%%&$&&#&$*##*&%&&&^#*$#%#&#$#&^&^#$&$%*#&%$*%$^^&*&*$&*$*$#%*^$&%*&^#*#*&*&$#$&#&$#&$#&%^$");
      searchSteps.blogHoverAndSearchField("! @#$%^&*()_+}{|\":?><\\';'\\][=-");
      searchSteps.waitABit(5000);
  }
  @Test
    public void blogSearchVariation()  {
      loginSteps.cookieAcceptButton();
      searchSteps.blogHoverAndClickBlogButton();
      searchSteps.blogFormFilterSelectYear();
      searchSteps.blogSearchField("1fsaf234fasfasf5325y4hujnfsdeadsh=-DGHFTFHRTF09876543");
      searchSteps.blogSearchField("Chiloti");
      searchSteps.blogSearchField("");
      searchSteps.blogSearchField("întrebări frecvente");
      searchSteps.blogSearchField("as");
      searchSteps.blogSearchField("! @#$%^&*()_+}{|\":?><\\';'\\][=-");
      searchSteps.blogSearchField("sfaturi");
      searchSteps.waitABit(500);
      searchSteps.blogFormFilterSorting_A_la_Z();
      searchSteps.blogSearchField("întrebări frecvente");
      searchSteps.blogSearchField("as");
      searchSteps.waitABit(500);
      searchSteps.blogFormFilterSorting_Z_la_A();
      searchSteps.blogSearchField("! @#$%^&*()_+}{|\":?><\\';'\\][=-");
      searchSteps.blogSearchField("sfaturi");
      searchSteps.waitABit(500);
      searchSteps.blogFormFilterSorting_Date_Oldest();
      searchSteps.blogSearchField("1fsaf234fasfasf5325y4hujnfsdeadsh=-DGHFTFHRTF09876543");
      searchSteps.blogSearchField("Chiloti");
      searchSteps.waitABit(500);
      searchSteps.blogFormFilterSorting_Date_Newest();
      searchSteps.blogSearchField("as");
      searchSteps.blogSearchField("! @#$%^&*()_+}{|\":?><\\';'\\][=-");
      searchSteps.blogSearchField("sfaturi");
    }
    @Test
    public void blogSearchArticles(){
        loginSteps.cookieAcceptButton();
        searchSteps.blogHoverAndClickBlogButton();
        searchSteps.blogFormFilterSelectYear();
        searchSteps.blogSearchField("sfaturi");
        searchSteps.blogSearchArticle();
        searchSteps.blogHoverAndClickBlogButton();
        searchSteps.blogSearchField("întrebări frecvente");
        searchSteps.blogSearchArticle();
        searchSteps.blogHoverAndClickBlogButton();
        searchSteps.blogSearchField("sport");
        searchSteps.blogSearchArticle();
    }

}
