package com.example.santanderdevweek.data.local

import com.example.santanderdevweek.data.Cartao
import com.example.santanderdevweek.data.Cliente
import com.example.santanderdevweek.data.Conta

class FakeData {
    fun getLocalData(): Conta {
        val cliente = Cliente("Elisabeth")
        val cartao = Cartao("41111111")
        return Conta(
            "445655-4",
            "6552-4",
            "R$ 2.450,00",
            "4.120,00",
            cliente,
            cartao
        )
    }
}