package aula1409kotlin.cadastroAlunos

class Aula(val materia: Materia, val horarioInicio: String, val horarioTermino: String) {
    override fun toString(): String {
        return "${materia.nome} ($horarioInicio - $horarioTermino)"
    }
}