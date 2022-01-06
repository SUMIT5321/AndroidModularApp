//dependencyResolutionManagement {
//    repositoriesMode.set(org.gradle.api.initialization.resolve.RepositoriesMode.FAIL_ON_PROJECT_REPOS)
//    repositories {
//        google()
//        mavenCentral()
//    }
//}

rootProject.name = "TemplateApp3"

include(
    ":app",
    ":core",
    ":common:commonDomain",
    ":common:commonApp",
    ":features:onboarding",
    "features:dashboard",
)
include(":navigation")
