// comentário de fronteira: NavGraph.kt — monta o NavHost do app. Hoje só tem a
// rota Home, com uma tela placeholder. Quando F1/F2/F3 entrarem, cada feature
// registra sua própria rota aqui (dentro de ui/features/).
package br.edu.ifpe.ateliedasuuh.ui.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavGraph(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController, startDestination = NavTarget.Home.route) {
        composable(NavTarget.Home.route) {
            HomePlaceholderScreen()
        }
    }
}

@Composable
private fun HomePlaceholderScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Ateliê da Suuh")
    }
}
