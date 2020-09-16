package aula1409kotlin.cadastroAlunos

class Professor(val nome: String, val rd: String) {
    fun darAula(aula: Aula, turma: Turma) {
        println("A aula $aula foi dada para a turma $turma com sucesso")
    }
    fun fazerChamada(turma: Turma){
        println("Fazendo a chamada da turma $turma")
        for (aluno in turma.curso.listaAlunos){
            println(aluno)
        }
    }

}
