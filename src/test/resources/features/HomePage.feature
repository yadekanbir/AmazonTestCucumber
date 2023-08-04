@Amazon
Feature: Amazon Suite

  @AmazonTestCase
  Scenario Outline: Amazon Test Case
    Given User is on the Home Page
    When click the Login Button on Home Page
    Then should see the Login Page
    When click Email Button on Login Page
    When type email "<email>" on Login Page
    When click the Continue Button on Login Page
    When type password "<password>" on Login Page
    When click the Sign In Button on Login Page
    Then should see the Home Page
    When click the list on Home Page
    When select category: "Bahçe" on Home Page
    When type product "<item>" on Home Page
    Then should see Title: "Amazon.com.tr : araba" on Products Page
    When choose the product on Products Page
    When add product to wishlist on Product Detail Page
    When go to wishlist on Product Detail Page
    Then should see the Wishlist Page
    When add product to cart on Wishlist Page
    When go to cart on Wishlist Page
    Then should see the Basket Page
    When delete product from basket on Basket Page
    Then should see the product is delete from basket on Basket Page
    When go to wishList on Basket Page
    When delete product from wishList on Wishlist Page
    Examples:
      | email                  | password     | item  |
      | yadekanbir12@gmail.com | 22052001yade | araba |