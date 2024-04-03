package gadini.com.github.checkpoint1.view.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import gadini.com.github.checkpoint1.R
import gadini.com.github.checkpoint1.model.Orcamento

/**
 * Esta classe representa um adaptador para exibir uma lista de orçamentos em uma RecyclerView.
 */

class ListaOrcamentoAdapter(
    private val context: Context,
    private val orcamentos: List<Orcamento>
) : RecyclerView.Adapter<ListaOrcamentoAdapter.ViewHolder>() {

     /**
     * Esta classe representa um ViewHolder para exibir cada item na RecyclerView.
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        /**
         * Método para vincular os dados de um orçamento aos componentes da interface do usuário.
         *
         * @param orcamento O objeto Orcamento a ser exibido.
         */
        fun vincula(orcamento: Orcamento) {
            val nome = itemView.findViewById<TextView>(R.id.nome)
            nome.text = orcamento.itemNome

            val descricao = itemView.findViewById<TextView>(R.id.descricao)
            descricao.text = orcamento.descricao

            val valor = itemView.findViewById<TextView>(R.id.valor)
            valor.text = orcamento.valor.toPlainString()
        }
    }

     /**
     * Método chamado quando é necessário criar um novo ViewHolder.
     *
     * @param parent O ViewGroup ao qual a nova visualização será anexada.
     * @param viewType O tipo da nova visualização.
     * @return Um novo ViewHolder que contém a nova visualização.
     */
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListaOrcamentoAdapter.ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.orcamento, parent, false)
        return ListaOrcamentoAdapter.ViewHolder(view)
    }

    /**
     * Retorna o número total de itens na lista de orçamentos.
     *
     * @return O número total de itens na lista de orçamentos.
     */
    override fun getItemCount(): Int = orcamentos.size

    /**
     * Chamado para exibir os dados na posição especificada.
     *
     * @param holder O ViewHolder que deve ser atualizado para representar o conteúdo do item na posição dada no conjunto de dados.
     * @param position A posição do item dentro do conjunto de dados.
     */
    override fun onBindViewHolder(holder: ListaOrcamentoAdapter.ViewHolder, position: Int) {
        val orcamento = orcamentos[position]
        holder.vincula(orcamento)
    }
}
