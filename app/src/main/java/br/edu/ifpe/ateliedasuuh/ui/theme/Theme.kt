// comentário de fronteira: Theme.kt — junta as cores (Color.kt) e a tipografia
// (Type.kt) num MaterialTheme único, usado pelo MainActivity. Sem dynamic color
// por padrão, pra manter a identidade visual roxa do ateliê em qualquer aparelho.
package br.edu.ifpe.ateliedasuuh.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = AteliePrimaryDark,
    secondary = AtelieSecondaryDark,
    tertiary = AtelieTertiaryDark
)

private val LightColorScheme = lightColorScheme(
    primary = AteliePrimary,
    secondary = AtelieSecondary,
    tertiary = AtelieTertiary
)

@Composable
fun AtelieDaSuuhTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
