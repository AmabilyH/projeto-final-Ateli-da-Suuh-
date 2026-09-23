// comentário de fronteira: build.gradle.kts (raiz) — só declara as versões dos
// plugins usados no projeto. Não aplica nada aqui; quem aplica é o app/build.gradle.kts.
// Regra do AGENTS.md: ninguém mexe neste arquivo sem o grupo revisar antes.
plugins {
    id("com.android.application") version "8.6.0" apply false
    id("org.jetbrains.kotlin.android") version "2.0.21" apply false
    id("org.jetbrains.kotlin.plugin.compose") version "2.0.21" apply false
    id("com.google.devtools.ksp") version "2.0.21-1.0.28" apply false
}
