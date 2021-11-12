package com.abnamro.apps.referenceandroid.Helper

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.abnamro.apps.referenceandroid.R
import org.hamcrest.Matchers

class MainHelper {

    private val toastMessage = "Replace with your own action"
    private val homepageText = "Hello World!"
    private val appName = "ReferenceAndroid"
    private val emailButton = withId(R.id.fab)
    private val toolbarButton = withId(R.id.toolbar)
    private val toolbarSettings = "Settings"

    private val toolbarIcon = onView(
        Matchers.allOf(
            ViewMatchers.withContentDescription("More options"),
            ViewMatchers.withParent(ViewMatchers.withParent(toolbarButton)),
            ViewMatchers.isDisplayed()
        )
    )

    fun isEmailButtonDisplayed(){
        onView(emailButton).check(matches(ViewMatchers.isDisplayed()))
    }

    fun clickOnEmailBtn() {
        //Find the Email Button and verify if button is clickable
        onView(emailButton).perform(ViewActions.click()).check(
                matches(ViewMatchers.isClickable()))
    }

    fun assertToastMessage(){
        //Assert the text after clicking the Email button
        onView(withText("Replace with your own action")).check(
            matches(withText(toastMessage)))
    }


    fun checkHomepageText(){
        //Assert if the text on the homepage matches with its String value
        onView(withText("Hello World!")).check(matches(withText(homepageText)))
    }

    fun appNameAssert(){
        //Assert if the app name matches with its String value
        onView(withText("ReferenceAndroid")).check(matches(withText(appName)))
    }

    fun toolbarClick(){

        toolbarIcon.perform(ViewActions.click())
    }

    fun isToolbarDisplayed(){
        toolbarIcon.check(matches(ViewMatchers.isDisplayed()))
    }

    fun toolbarAssert(){
        onView(withText("Settings")).check(matches(withText(toolbarSettings)))
    }

}