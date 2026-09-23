// comentário de fronteira: NavTarget.kt — lista central das rotas de navegação
// do app. Por enquanto só existe a tela inicial (Home); cada nova tela ganha um
// novo "data object" aqui conforme o grupo for implementando F1/F2/F3.
package br.edu.ifpe.ateliedasuuh.ui.navigation

sealed class NavTarget(val route: String) {
    data object Home : NavTarget("home")
}
