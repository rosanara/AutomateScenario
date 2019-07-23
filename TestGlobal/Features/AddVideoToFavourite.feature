// write here all the fearure file 

Scenario: Enter the URL.Navigate to the discovery sight 

Feature: Navigate to the dicovery page and select one video and add to my favourite 

Given User should have valid url to navigate to discovery sight

When Should should allow the user to select one video from the Show list
And click one video from the show list
And Verify the title of the video and click on Watch now button
And Verify that Add to favourite plus button should display when the user hover on it.
And  Click on plus button
Then verify the video get added in My video list
 
 
 