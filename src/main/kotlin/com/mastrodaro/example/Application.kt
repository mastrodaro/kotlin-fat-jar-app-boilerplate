package com.mastrodaro.example

import org.koin.core.KoinComponent
import org.koin.core.context.startKoin
import org.koin.core.inject
import org.koin.dsl.module

val appModule = module {
    single { ExampleInjectedClass(get()) }
    single { ExampleInjectedByFieldClass() }
}

class Application() : KoinComponent {
    val exampleInjectedClass by inject<ExampleInjectedClass>()
}

fun main() {
    startKoin {
        modules(appModule)
    }

    println(Application().exampleInjectedClass.exampleMethod("value"))
}
