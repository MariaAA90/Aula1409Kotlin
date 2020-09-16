package aula1409kotlin.cadastroAlunos

class Turma(val nome: String, val curso: Curso) {
    override fun toString(): String {
        return "$nome do curso ${curso.nome}"
    }
}