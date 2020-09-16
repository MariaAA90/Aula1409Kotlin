package aula1409kotlin.suprimentosInformatica

fun main(){
    val item1 = Item(4,"mesa",5,65.20)
    val item2 = Item(6,"cadeira",10,84.15)
    val fatura = Fatura(listOf(item1,item2))
    println("Total da Fatura: ${fatura.getTotalFatura()}")

}