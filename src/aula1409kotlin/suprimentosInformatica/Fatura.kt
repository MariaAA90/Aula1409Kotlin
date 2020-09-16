package aula1409kotlin.suprimentosInformatica

class Fatura (val listaItens: List<Item>){
    fun getTotalFatura(): Double{
        var valorFatura = 0.0
        for (item in listaItens){
            var valorItem = item.quantidade *item.precoUnitario
            valorFatura += valorItem
        }
        return valorFatura
    }
}