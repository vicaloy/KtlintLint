package com.example.ktlintlint

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class ExampleUnitTest {

    @Test
    fun `a test`() {
        assertThat("hello", `is`("world"))
    }

}