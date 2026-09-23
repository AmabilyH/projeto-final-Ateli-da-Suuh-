// comentário de fronteira: MainActivity.kt — única Activity do app. Só aplica o
// tema (AtelieDaSuuhTheme) e entrega o controle pro NavGraph. Nenhuma lógica de
// tela ou de dados deve morar aqui.
package br.edu.ifpe.ateliedasuuh

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import br.edu.ifpe.ateliedasuuh.ui.navigation.NavGraph
import br.edu.ifpe.ateliedasuuh.ui.theme.AtelieDaSuuhTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AtelieDaSuuhTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    NavGraph()
                }
            }
        }
    }
}
