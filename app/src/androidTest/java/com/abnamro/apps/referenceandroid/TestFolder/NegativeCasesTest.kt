package com.abnamro.apps.referenceandroid.TestFolder

import com.abnamro.apps.referenceandroid.BaseTest.BaseTest
import com.abnamro.apps.referenceandroid.Utilities.Utilities
import com.abnamro.apps.referenceandroid.Helper.MainHelper
import com.abnamro.apps.referenceandroid.Helper.NegativeCasesHelper
import org.junit.Test

class NegativeCasesTest :BaseTest() {
// Examples of some Negative Test cases
    private val mainHelperNegative = NegativeCasesHelper()
    private val mainHelper = MainHelper()
    private val utilities = Utilities()
    

    // Click on Email Button and after Check if Toast message matches its String value. 
    @Test
    fun clickEmailButtonCheckMessageNegative() {
        //Step 1: CLick Email Button
        mainHelper.clickOnEmailBtn()
        //Step 2: assert the toast message
        mainHelperNegative.assertToastMessageNegative()
    }

    @Test
    fun assertAppName(){
        // Assert the app name,
        mainHelperNegative.assertAppNameNegative()
    }

    @Test
    fun wrongTextSettings(){
        // Step 1: Check if toolbar is displayed
        mainHelper.isToolbarDisplayed()
        //Step 2: Click on toolbar
        mainHelper.toolbarClick()
        // Step 3: Assert you have been navigated correctly to Setting.
        mainHelperNegative.assertWrongActivity()
    }
}