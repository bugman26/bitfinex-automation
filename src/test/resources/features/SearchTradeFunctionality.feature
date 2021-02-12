@search
Feature: Search Trading Functionality

  @searchHappyPath
  Scenario Outline: User successfully search
    Given User is on the Bitfinex Landing page
    When User clicks the search icon
    And User enters "<Search Text>" on the search field
    And User clicks the searh result
    Then User is redirected to "<URL>"
    
    Examples: 
      | Search Text   | URL                                    | 
      | Unus Sed Leo  | https://trading.bitfinex.com/t/LEO:USD?demo=true | 

    

 
