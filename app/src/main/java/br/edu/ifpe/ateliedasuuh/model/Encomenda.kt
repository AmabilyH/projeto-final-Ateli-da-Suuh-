// comentário de fronteira: Encomenda.kt — entidade Room que representa uma
// encomenda do ateliê. Base para F1 (Amabily) e F2 (Fábio Matheus, que usa os
// campos "pago" e "valor" no DAO). Sem Database/DAO ainda — só a entidade.
package br.edu.ifpe.ateliedasuuh.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "encomendas")
data class Encomenda(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val cliente: String,
    val produto: String,
    val valor: Double,
    val status: String = STATUS_PENDENTE,
    val pago: Boolean = false,
    val dataCriacao: Long = System.currentTimeMillis()
) {
    companion object {
        const val STATUS_PENDENTE = "pendente"
        const val STATUS_EM_PRODUCAO = "em_producao"
        const val STATUS_PRONTA = "pronta"
        const val STATUS_ENTREGUE = "entregue"
    }
}