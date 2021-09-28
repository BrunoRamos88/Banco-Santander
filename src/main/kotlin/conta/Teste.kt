package conta

import cliente.ClientePF
import cliente.ClientePJ
import cliente.Endereco

fun main() {
    val conta = ContaPoupanca(123, "001")
    println("Saldo: ${conta.getSaldo()}")
    conta.depositar(50.0)
    println("Saldo: ${conta.getSaldo()}")
    println(" Taxa: ${conta.taxa()}")

    val contaCorrente = ContaCorrente(366, "001")
    contaCorrente.depositar(10.0)
    println("Taxa: ${contaCorrente.taxa()}")

    println("----------------------------------------")

    val endereco = Endereco("Rua Um", 222, "Cassino")
    val endereco2 = Endereco("Rua Dois", 333, "Cassino", "Apt 01")
    val endereco3 = endereco.copy(complemento = "Apt 02")

    val clienteCarol = ClientePF(endereco2, conta, "Carol", 29)
    clienteCarol.imprimirDados()
    println(clienteCarol.segmento)

    val clienteLuis = ClientePJ(endereco3, contaCorrente, "CNPJ", "Razão Social")
    clienteLuis.imprimirDados()



}