# Kotlin fat jar app boilerplate
Project skeleton ready to development of Kotlin fat jar application.

# Dependencies
* Kotlin
* Koin
* Logback (slf4j)
* Detekt
* TestNG + AssertJ
* Jacoco coverage
* Gradle

# Gradle tasks
* detekt
* test
* fatJar

# Gradle config
If there are problems gradle cannot find jdk add to the file *~/.gradle/gradle.properties* following:
```
org.gradle.java.home=<path to jdk>
```
