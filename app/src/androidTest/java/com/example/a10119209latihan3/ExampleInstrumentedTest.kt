package com.example.a10119209latihan3

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(android.support.test.runner.AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = android.support.test.InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.a10119209latihan3", appContext.packageName)
    }
}