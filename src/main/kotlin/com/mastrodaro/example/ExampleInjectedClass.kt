package com.mastrodaro.example

class ExampleInjectedClass(private val exampleInjectedByFieldClass: ExampleInjectedByFieldClass) {
    fun exampleMethod(param: String) = "${exampleInjectedByFieldClass.example} $param"
}
