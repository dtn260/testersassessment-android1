package com.abnamro.apps.referenceandroid.Helper

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withText

class NegativeCasesHelper {

    private val wrongtoastMessage = "Not quite my tempo"
    private val wrongAppName = "Wrong name"
    private val wrongToolbar= "WSettings"

    //pages sayfasi olsun, her big page bir tane class olacak


    fun assertToastMessageNegative(){
        //Assert the text after clicking the Email button
        onView(withText("Replace with your own action")).check(matches(withText(wrongtoastMessage))
        )

    }

    fun assertAppNameNegative(){
        //Assert the text after clicking the Email button
        onView(withText("ReferenceAndroid")).check(matches(withText(wrongAppName))
        )
    }

    fun assertWrongActivity(){

        onView(withText("Settings")).check(matches(withText(wrongToolbar)))
    }



}