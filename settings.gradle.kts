pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }


}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
       maven  ("https://jitpack.io")








    }

}

rootProject.name = "Amazon1"
include(":app")
 