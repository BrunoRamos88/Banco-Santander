package conta

fun main() {
    val listPessoas = listOf("Olivia", "Peter", "Dr. Walter", "Astrid")
    println("Quantidade de pessoas = ${listPessoas.size}")
    for (pessoa in listPessoas) {
        println("Pessoa -> $pessoa")
    }
}