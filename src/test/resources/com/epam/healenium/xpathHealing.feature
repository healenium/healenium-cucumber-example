Feature: Example scenario using Healenium + Cucumber + Selenium

  Scenario: User enters a name and submits the form
    Given User opens the web page "https://elenastepuro.github.io/test_env/index.html"
    When Find element by xpath "//*[@id='change:name']"
    And Update firm attributes and click the button with id "Submit"
    Then User can find the field with xpath "//*[@id='change:name']" anyway after submitting the form
