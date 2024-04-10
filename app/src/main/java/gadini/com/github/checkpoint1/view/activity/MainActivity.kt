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

/**
 * Esta classe representa a atividade principal da aplicação.
 * A MainActivity é responsável por exibir a interface do usuário e lidar com a interação do usuário.
 */

class MainActivity : ComponentActivity() {
    /**
     * Método onCreate chamado quando a atividade está sendo criada.
     * OnCreate: Quando você cria uma nova atividade ou fragmento em um projeto do Android Studio, 
     * o método onCreate() é gerado automaticamente para você. 
     * Ele é responsável por realizar várias tarefas de inicialização, 
     * como configurar a interface do usuário (por exemplo, inflar um layout), configurar variáveis, 
     * associar objetos a elementos de interface do usuário, inicializar componentes necessários 
     * e realizar qualquer outra configuração inicial necessária para a atividade ou fragmento 
     * funcionar corretamente.
     *
     * @param savedInstanceState Um objeto Bundle contendo o estado anterior da atividade.
     * Bundle: arquivo que contém um conjunto de recursos, como códigos fonte, arquivos de layout, 
     * imagens, arquivos de configuração, etc., relacionados a um aplicativo Android. 
     * Esses arquivos são agrupados em um pacote para facilitar a distribuição e implantação do aplicativo em dispositivos Android.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Encontra a RecyclerView no layout da atividade
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        /**
        * findViewById() é um método utilizado em desenvolvimento de aplicativos 
        * Android para encontrar uma view (ou elemento de interface do usuário) com base no ID fornecido. 
        * Quando você cria layouts de interface de usuário em arquivos XML (como activity_main.xml), 
        * cada view dentro desse layout pode ter um ID associado a ele. 
        * Este ID é usado para identificar exclusivamente essa view dentro do layout.
        * O método findViewById() é chamado em uma instância de View, como uma Activity ou um Fragment, 
        * e retorna a view correspondente ao ID fornecido. 
        * A view retornada é do tipo View, então geralmente é necessário fazer um cast para
        * o tipo específico da view que você está procurando, como TextView, Button, ImageView, etc.
        */
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
