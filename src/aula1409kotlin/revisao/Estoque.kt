package aula1409kotlin.revisao

class Estoque(var nome: String, var qtdAtual: Int, var qtdMinima: Int) {
    fun mudarNome(nome: String) {
        this.nome = nome
    }

    fun mudarQtdMinima(qtdMinima: Int) {
        if (qtdMinima >= 0){
            this.qtdMinima = qtdMinima
        }
    }

    fun repor(qtd: Int) {
        qtdAtual += qtd
    }

    fun darBaixa(qtd: Int) {
        if (qtd <= qtdAtual) {
            qtdAtual -= qtd
        }
    }

    fun mostra(): String {
        return "Produto: $nome, quantidade mínima $qtdMinima, quantidade atual $qtdAtual"
    }

    fun precisaRepor(): Boolean{
        return qtdAtual <= qtdMinima
    }
}