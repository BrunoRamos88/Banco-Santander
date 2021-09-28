package cliente

import conta.Conta

class ClientePJ(
    endereco: Endereco,
    conta: Conta,
    val cnpj: String,
    val razaoSocial: String
    ) : Cliente(conta = conta, endereco = endereco) {

    override fun imprimirDados() {
        println("Razão Social: $razaoSocial, Conta: ${conta.numero}, Endereco: $endereco")
    }
    }