package conta

fun main() {
    /*
    val salario1 = 100.0
    val salario2 = 2000.0
    val salario3 = 1500.0

   val maiorSalario =  if (salario1 > salario2 && salario1 > salario3) {
        salario1
    } else if (salario2 > salario1 && salario2 > salario3) {
        salario2
    } else {
        salario3
    }

    print("Maior salário: $maiorSalario")
     */
/*
    val arrayDeSalarios = DoubleArray(3)
    arrayDeSalarios[0] = 1000.0
    arrayDeSalarios[1] = 2000.0
    arrayDeSalarios[2] = 500.0

    var maiorSalario = 0.0
    for (salario in arrayDeSalarios) {
        if (salario > maiorSalario) {
            maiorSalario = salario
        }

        println("Salário: $salario")
    }

    println("Maior salário: $maiorSalario")
 */

//    val arrayDeSalarios = DoubleArray(3)
//    arrayDeSalarios[0] = 1000.0
//    arrayDeSalarios[1] = 2000.0
//    arrayDeSalarios[2] = 500.0

    val arrayDeSalarios = arrayOf(1000.0, 2000.0, 500.0)

    var maiorSalario = 0.0
    for (indice in arrayDeSalarios.indices) {
        if (arrayDeSalarios[indice] > maiorSalario) {
            maiorSalario = arrayDeSalarios[indice]
        }

        println("Salário: ($indice):${arrayDeSalarios[indice]}")
    }

    println("Maior salário: $maiorSalario")

    val somaTodosSalarios = arrayDeSalarios.sum()

    println("Soma de todos os salários = $somaTodosSalarios")

    val salariosOrdenados = arrayDeSalarios.sorted()
    println("Salários ordenados $salariosOrdenados")

    val salariosOrdemDecrescente = arrayDeSalarios.sorted().reversed()
    println("Salários ordem decrescente $salariosOrdemDecrescente")

}