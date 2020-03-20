package com.mastrodaro.example

import org.assertj.core.api.Assertions.assertThat
import org.koin.core.context.startKoin
import org.koin.test.KoinTest
import org.koin.test.inject
import org.testng.annotations.Test

class ExampleInjectedClassTest : KoinTest {
    private val exampleInjectedClass by inject<ExampleInjectedClass>()

    init {
        startKoin { modules(appModule) }
    }

    @Test
    fun `Example test`() {
        assertThat(exampleInjectedClass.exampleMethod("value")).isEqualTo("example value")
    }
}
