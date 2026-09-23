// comentário de fronteira: settings.gradle.kts — define onde o Gradle busca
// plugins/dependências e quais módulos existem no projeto (só ":app" por enquanto).
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
    }
}

rootProject.name = "AtelieDaSuuh"
include(":app")
