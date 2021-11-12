package com.abnamro.apps.referenceandroid.Utilities

import androidx.lifecycle.Lifecycle
import androidx.test.core.app.ActivityScenario
import androidx.test.platform.app.InstrumentationRegistry
import com.abnamro.apps.referenceandroid.MainActivity
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.UiSelector
import androidx.test.espresso.Espresso.onView

import androidx.test.espresso.matcher.ViewMatchers.isClickable

import android.R
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches

import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.abnamro.apps.referenceandroid.BaseTest.BaseTest
import org.junit.Test


//Useful functions to have for in the future.
// Some of these functions might be useful to have for features in the future.


class Utilities :BaseTest() {



    // Functions to turn the wifi on and off through shell commands to test te application with or without internet.
    private fun sendShellCommand(wifiOption: String, dataOption: String) {
        val options = arrayOf(wifiOption, dataOption)
        for (option in options) {
            InstrumentationRegistry.getInstrumentation().uiAutomation.executeShellCommand(option)
        }
    }

    fun enableWifiAndData() {
        sendShellCommand("svc wifi enable", "svc data enable")
        Thread.sleep(1000)
    }

    fun disableWifiAndData() {
        sendShellCommand("svc wifi disable", "svc data disable")
    }

    // Functions to send the application to background and resuming the app afterwards, to test continuity.

    fun appToBackgroundThenResume() {
        val device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
        device.pressHome()
        device.pressRecentApps()
        val selector = UiSelector()
        val recentApp = device.findObject(selector.descriptionContains("ReferenceAndroid"))
        Thread.sleep(2000)
        recentApp.click()
    }

}