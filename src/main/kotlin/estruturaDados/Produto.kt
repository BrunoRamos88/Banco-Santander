package estruturaDados

data class Produto(val name: String, val valor: Double)

class CarrinhoDeCompras() {

    private val _listaDeProdutos: MutableList<Produto> = mutableListOf()

    fun quantidadeDeProdutos(): Int {
        return _listaDeProdutos.size
    }

    fun listaProdutos() {
        println("Quant. ${quantidadeDeProdutos()} - Lista de produtos: $_listaDeProdutos ")
    }

    fun adicionarProduto(produto: Produto) {
        _listaDeProdutos.add(produto)
    }

    fun removerProduto(posicao: Int) {
        _listaDeProdutos.removeAt(posicao)
    }

    fun removerProduto(produto: Produto) {
        _listaDeProdutos.remove(produto)
    }

    fun buscarProdutoPorNome(nome: String) {
        val produtos = _listaDeProdutos.filter { produto ->
            (produto.name.contains(nome))
        }

        println("Produtos encontrados: $produtos")
    }

    fun produtoMaisCaro() : Produto? {
        return _listaDeProdutos.maxByOrNull { produto ->
            produto.valor
        }
    }

    fun produtoMaisBarato() : Produto? {
        return _listaDeProdutos.minByOrNull {
            it.valor
        }
    }


}

fun main() {
    val carrinhoDeCompras = CarrinhoDeCompras()
    carrinhoDeCompras.listaProdutos()
    val produto1 = Produto("Mouse", 35.0)
    val produto2 = Produto("Teclado", 39.99)
    carrinhoDeCompras.adicionarProduto(produto1)
    carrinhoDeCompras.adicionarProduto(produto2)
    carrinhoDeCompras.adicionarProduto(Produto("Mousepad", 12.99))
    carrinhoDeCompras.listaProdutos()
    carrinhoDeCompras.removerProduto(Produto("Mousepad", 12.99))
    carrinhoDeCompras.listaProdutos()
    carrinhoDeCompras.buscarProdutoPorNome("Mou")
    println("Produto mais caro: ${carrinhoDeCompras.produtoMaisCaro()}")
    println("Produto mais barato: ${carrinhoDeCompras.produtoMaisBarato()}")
}
