package gadini.com.github.checkpoint1.view.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import gadini.com.github.checkpoint1.R
import gadini.com.github.checkpoint1.model.Orcamento

class ListaOrcamentoAdapter(
    private val context: Context,
    private val orcamentos: List<Orcamento>
) : RecyclerView.Adapter<ListaOrcamentoAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun vincula(orcamento: Orcamento) {
            val nome = itemView.findViewById<TextView>(R.id.nome)
            nome.text = orcamento.itemNome

            val descricao = itemView.findViewById<TextView>(R.id.descricao)
            descricao.text = orcamento.descricao

            val valor = itemView.findViewById<TextView>(R.id.valor)
            valor.text = orcamento.valor.toPlainString()
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListaOrcamentoAdapter.ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.orcamento, parent, false)
        return ListaOrcamentoAdapter.ViewHolder(view)
    }

    override fun getItemCount(): Int = orcamentos.size

    override fun onBindViewHolder(holder: ListaOrcamentoAdapter.ViewHolder, position: Int) {
        val orcamento = orcamentos[position]
        holder.vincula(orcamento)
    }
}