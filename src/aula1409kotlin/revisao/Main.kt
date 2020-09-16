package aula1409kotlin.revisao

fun main(){
    var nome1 = Estoque("camiseta",100,50)
    nome1.mudarNome("camisa")
    nome1.mudarQtdMinima(46)
    nome1.mudarQtdMinima(-1)
    nome1.repor(75)
    nome1.darBaixa(11)
    nome1.darBaixa(200)
    nome1.mostra()
    println(nome1.mostra())
    println("Precisa repor? ${nome1.precisaRepor()}")

}