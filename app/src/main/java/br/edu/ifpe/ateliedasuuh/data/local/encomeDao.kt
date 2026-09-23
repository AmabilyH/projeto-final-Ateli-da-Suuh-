package br.edu.ifpe.ateliedasuuh.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.edu.ifpe.ateliedasuuh.model.Encomenda
import kotlinx.coroutines.flow.Flow

@Dao
interface EncomendaDao {

    @Insert
    suspend fun inserir(encomenda: Encomenda)

    @Update
    suspend fun atualizar(encomenda: Encomenda)

    @Query("SELECT * FROM encomendas WHERE status != 'entregue'")
    fun listarEmAndamento(): Flow<List<Encomenda>>

    @Query("SELECT * FROM encomendas WHERE status = 'entregue'")
    fun listarEntregues(): Flow<List<Encomenda>>

    @Query("SELECT SUM(valor) FROM encomendas WHERE pago = 1")
    fun faturamentoTotal(): Flow<Double?>

    @Query("SELECT COUNT(*) FROM encomendas WHERE pago = 0")
    fun contarNaoPagas(): Flow<Int>

    @Query("SELECT COUNT(*) FROM encomendas WHERE pago = 1 AND status != 'entregue'")
    fun contarPagasAguardandoEntrega(): Flow<Int>
}