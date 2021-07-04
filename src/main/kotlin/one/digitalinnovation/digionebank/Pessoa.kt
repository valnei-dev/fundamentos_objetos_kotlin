package one.digitalinnovation.digionebank

class Pessoa { //Classe
    var nome: String = "Valnei" //membro da classe
    var cpf: String = "127.669.995-60" //membro da classe

    inner class Endereco {
        var rua: String = "Rua João da Veiga"
    }
}

fun main() {
    val valnei = Pessoa() //Recebe uma instancia da classe e possibilita imprimir o membro

    println(valnei.nome) //imprime o membro
    println(valnei.cpf) //imprime o membro

    println(valnei.Endereco().rua)
}