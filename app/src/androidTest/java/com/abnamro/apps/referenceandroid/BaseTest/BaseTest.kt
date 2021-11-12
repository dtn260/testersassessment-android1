package com.abnamro.apps.referenceandroid.BaseTest

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.abnamro.apps.referenceandroid.MainActivity
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
public abstract class BaseTest {

    @get:Rule // Define Rule and Launch an activity before test
    var activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

}