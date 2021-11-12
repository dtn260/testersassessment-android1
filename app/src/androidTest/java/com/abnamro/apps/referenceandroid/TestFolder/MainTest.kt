package com.abnamro.apps.referenceandroid.TestFolder


import org.junit.Test
import com.abnamro.apps.referenceandroid.BaseTest.BaseTest
import com.abnamro.apps.referenceandroid.Utilities.Utilities
import com.abnamro.apps.referenceandroid.Helper.MainHelper

class MainTest : BaseTest() {

    private val mainHelper = MainHelper()
    private val utilities = Utilities()

    // Check if the Email Button Is Displayed
    @Test
    fun isEmailButtonDisplayed() {
        mainHelper.isEmailButtonDisplayed()
    }

    // Click on Email Button and after Check if Toast message matches its String value.
    @Test
    fun clickEmailButtonCheckMessage() {
        //Step 1: CLick Email Button
        mainHelper.clickOnEmailBtn()
        //Step 2: assert the toast message
        mainHelper.assertToastMessage()

    }

    //Assert Textview on the middle of the Mainpage, check if its string value matches the assigned value.
    @Test
    fun assertMainpageText(){
        mainHelper.checkHomepageText()
    }

    //Assert the app name
    @Test
    fun appNameControle(){
        mainHelper.appNameAssert()
    }

// Check if toolbar button is displayed and can be clicked. Then assert the String value that is shown after toolbar is Clicked.
    @Test
    fun clickToolbarAndControl(){
    // Step 1: Check if toolbar is displayed
        mainHelper.isToolbarDisplayed()

    //Step 2: Click on toolbar
        mainHelper.toolbarClick()

    // Step 3: Assert you have been navigated correctly to Setting.
        mainHelper.toolbarAssert()
    }

    //Extra cases, using some functions that I have defined in the Utilities class.
    // A case where we do assertions and then send the application to the background, then recall the app
    // to test continuity.

    @Test
    fun clickToolbarAndSendAppToBackground(){
        mainHelper.isToolbarDisplayed()
        mainHelper.toolbarClick()
        // call back function created in utilities
        utilities.appToBackgroundThenResume()
        //Check again if the toolbar is displayed and click
        mainHelper.isToolbarDisplayed()
        mainHelper.toolbarClick()
        // Assert you have been navigated correctly to Setting.
        mainHelper.toolbarAssert()
    }


}


