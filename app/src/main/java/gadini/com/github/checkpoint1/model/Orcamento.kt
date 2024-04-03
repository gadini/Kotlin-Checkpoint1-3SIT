package gadini.com.github.checkpoint1.model

import java.math.BigDecimal

/**
 * Esta classe representa um objeto de Orçamento.
 */

class Orcamento (

    /**
     * O nome do item relacionado ao orçamento.
     */
    val itemNome: String,

    /**
     * A descrição do orçamento.
     */
    val descricao: String,

    /**
     * O valor do orçamento, representado como BigDecimal para precisão financeira.
     */
    val valor: BigDecimal
    )