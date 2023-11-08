Answer to Issue https://github.com/JetBrains/compose-multiplatform/issues/3862

This sample shows how to resolve dependency version and use `forceMainThreadRendering` flag.

Take a look at [build.gradle.kts](shared%2Fbuild.gradle.kts)

```Kotlin
configurations.all {
    resolutionStrategy {
        force("org.jetbrains.compose.ui:ui:0.0.0-dev1260")
    }
}
```
It helps to use concrete version of module `org.jetbrains.compose.ui:ui`.

And in [main.ios.kt](shared%2Fsrc%2FiosMain%2Fkotlin%2Fmain.ios.kt)
This code:
```Kotlin
@OptIn(ExperimentalComposeApi::class)
fun MainViewController(): UIViewController {
    androidx.compose.ui.window.forceMainThreadRendering = true
    return ComposeUIViewController { App() }
}
```
