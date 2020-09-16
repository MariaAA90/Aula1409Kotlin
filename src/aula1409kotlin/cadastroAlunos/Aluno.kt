package aula1409kotlin.cadastroAlunos

class Aluno(val ra: String, val nome: String, val sobrenome: String) {
    fun assistirAula(aula: Aula) {
        println("O aluno $this assistiu a aula $aula")
    }

    fun fazerLicao(materia: Materia) {
        println("O aluno fez a lição de casa da matéria ${materia.nome}")
    }

    override fun toString(): String {
        return "$nome $sobrenome"
    }
}