package com.mastrodaro.example

import org.koin.core.KoinComponent
import org.koin.core.context.startKoin
import org.koin.core.inject
import org.koin.dsl.module
import org.slf4j.LoggerFactory

val appModule = module {
    single { ExampleInjectedClass(get()) }
    single { ExampleInjectedByFieldClass() }
}

class Application : KoinComponent {
    private val logger = LoggerFactory.getLogger(javaClass)
    val exampleInjectedClass by inject<ExampleInjectedClass>().also {
        logger.debug("Example log message: {}", this::class.simpleName)
    }
}

fun main() {
    startKoin {
        modules(appModule)
    }

    println(Application().exampleInjectedClass.exampleMethod("value"))
}
