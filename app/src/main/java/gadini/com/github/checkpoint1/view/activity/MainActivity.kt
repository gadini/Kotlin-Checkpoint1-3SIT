package gadini.com.github.checkpoint1.view.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.RecyclerView
import gadini.com.github.checkpoint1.R
import gadini.com.github.checkpoint1.model.Orcamento
import gadini.com.github.checkpoint1.ui.theme.Checkpoint1Theme
import gadini.com.github.checkpoint1.view.recyclerview.ListaOrcamentoAdapter
import java.math.BigDecimal

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaOrcamentoAdapter(
            context = this,
            orcamentos = listOf(
                Orcamento("Teste Martelo", "Teste Descrição 0", BigDecimal("19.90")),
                Orcamento("Teste Prego", "Teste Descrição 1", BigDecimal("1.90")),
                Orcamento("Teste Tijolo", "Teste Descrição 2", BigDecimal("39.90")),
            )
        )
    }
}