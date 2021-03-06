object Deps {

    object Jetbrains {
        object Kotlin : Group(name = "org.jetbrains.kotlin") {
            const val version = "1.3.71"

            object Plugin : Dependency(group = Kotlin, name = "kotlin-gradle-plugin", version = version)

            object StdLib {
                object Common : Dependency(group = Kotlin, name = "kotlin-stdlib-common", version = version)
                object Jdk7 : Dependency(group = Kotlin, name = "kotlin-stdlib-jdk7", version = version)
                object Js : Dependency(group = Kotlin, name = "kotlin-stdlib-js", version = version)
            }

            object SerializationPlugin : Dependency(group = Kotlin, name = "kotlin-serialization", version = version)

            object Reflect : Dependency(group = Kotlin, name = "kotlin-reflect", version = version)

            object Test {
                object Common : Dependency(group = Kotlin, name = "kotlin-test-common", version = version)
                object Js : Dependency(group = Kotlin, name = "kotlin-test-js", version = version)
                object Junit : Dependency(group = Kotlin, name = "kotlin-test-junit", version = version)
            }

            object TestAnnotations {
                object Common : Dependency(group = Kotlin, name = "kotlin-test-annotations-common", version = version)
            }
        }

        object Kotlinx : Group(name = "org.jetbrains.kotlinx") {
            object Coroutines {
                private const val version = "1.3.5"

                object Core : Dependency(group = Kotlinx, name = "kotlinx-coroutines-core", version = version) {
                    object Common : Dependency(group = Kotlinx, name = "kotlinx-coroutines-core-common", version = version)
                    object Native : Dependency(group = Kotlinx, name = "kotlinx-coroutines-core-native", version = version)
                    object Js : Dependency(group = Kotlinx, name = "kotlinx-coroutines-core-js", version = version)
                }

                object Android : Dependency(group = Kotlinx, name = "kotlinx-coroutines-android", version = version)
            }

            object Serialization {
                private const val version = "0.20.0"

                object RuntimeCommon : Dependency(group = Kotlinx, name = "kotlinx-serialization-runtime-common", version = version)
                object Runtime : Dependency(group = Kotlinx, name = "kotlinx-serialization-runtime", version = version)
                object RuntimeNative : Dependency(group = Kotlinx, name = "kotlinx-serialization-runtime-native", version = version)
            }
        }

        object Ktor : Group(name = "io.ktor") {
            object KtorClient {
                private const val version = "1.3.2"

                object Core : Dependency(group = Ktor, name = "ktor-client-core", version = version)
                object Okhttp : Dependency(group = Ktor, name = "ktor-client-okhttp", version = version)
                object Ios : Dependency(group = Ktor, name = "ktor-client-ios", version = version)

                object Json : Dependency(group = Ktor, name = "ktor-client-json", version = version)
                object JsonJvm : Dependency(group = Ktor, name = "ktor-client-json-jvm", version = version)
                object JsonNative : Dependency(group = Ktor, name = "ktor-client-json-native", version = version)

                object Logging : Dependency(group = Ktor, name = "ktor-client-logging", version = version)
                object LoggingJvm : Dependency(group = Ktor, name = "ktor-client-logging-jvm", version = version)
                object LoggingNative : Dependency(group = Ktor, name = "ktor-client-logging-native", version = version)

                object Serialization : Dependency(group = Ktor, name = "ktor-client-serialization", version = version)
                object SerializationJvm : Dependency(group = Ktor, name = "ktor-client-serialization-jvm", version = version)
                object SerializationNative : Dependency(group = Ktor, name = "ktor-client-serialization-native", version = version)
            }
        }
    }

    object Android {
        object Tools {
            object Build : Group(name = "com.android.tools.build") {
                object Gradle : Dependency(group = Build, name = "gradle", version = "3.6.1")
            }
        }
    }

    object AndroidX {
        object Core : Group(name = "androidx.core") {
            object Ktx : Dependency(group = Core, name = "core-ktx", version = "1.1.0")
        }

        object AppCompat : Group(name = "androidx.appcompat") {
            object AppCompat : Dependency(group = AndroidX.AppCompat, name = "appcompat", version = "1.1.0")
        }

        object RecyclerView : Group(name = "androidx.recyclerview") {
            object RecyclerView : Dependency(group = AndroidX.RecyclerView, name = "recyclerview", version = "1.1.0")
        }

        object ConstraintLayout : Group(name = "androidx.constraintlayout") {
            object ConstraintLayout : Dependency(group = AndroidX.ConstraintLayout, name = "constraintlayout", version = "1.1.3")
        }

        object DrawerLayout : Group(name = "androidx.drawerlayout") {
            object DrawerLayout : Dependency(group = AndroidX.DrawerLayout, name = "drawerlayout", version = "1.0.0")
        }

        object Lifecycle : Group(name = "androidx.lifecycle") {
            object LifecycleCommonJava8 : Dependency(group = Lifecycle, name = "lifecycle-common-java8", version = "2.2.0")
        }
    }

    object Badoo {
        object Reaktive : Group(name = "com.badoo.reaktive") {
            private const val version = "1.1.12"

            object Reaktive : Dependency(group = Badoo.Reaktive, name = "reaktive", version = version)
            object ReaktiveAnnotations : Dependency(group = Badoo.Reaktive, name = "reaktive-annotations", version = version)
            object ReaktiveTesting : Dependency(group = Badoo.Reaktive, name = "reaktive-testing", version = version)
            object Utils : Dependency(group = Badoo.Reaktive, name = "utils", version = version)
        }
    }

    object Arkivanov {
        object MviKotlin : Group(name = "com.arkivanov.mvikotlin") {
            private const val version = "2.0.0-beta2"

            object MviKotlin  : Dependency(group = Arkivanov.MviKotlin, name = "mvikotlin", version = version)
            object MviKotlinMain  : Dependency(group = Arkivanov.MviKotlin, name = "mvikotlin-main", version = version)
            object MviKotlinLogging  : Dependency(group = Arkivanov.MviKotlin, name = "mvikotlin-logging", version = version)
            object MviKotlinTimeTravel  : Dependency(group = Arkivanov.MviKotlin, name = "mvikotlin-timetravel", version = version)
            object MviKotlinExtCoroutines  : Dependency(group = Arkivanov.MviKotlin, name = "mvikotlin-extensions-coroutines", version = version)
        }

    }

    object Json : Group(name = "org.json") {
        object Json : Dependency(group = Deps.Json, name = "json", version = "20190722")
    }

    object TouchLab : Group(name = "co.touchlab") {
        object KotlinXcodeSync : Dependency(group = TouchLab, name = "kotlinxcodesync", version = "0.2")
    }

    open class Group(val name: String)

    open class Dependency private constructor(
        private val notation: String
    ) : CharSequence by notation {
        constructor(group: Group, name: String, version: String) : this("${group.name}:$name:$version")

        override fun toString(): String = notation
    }
}