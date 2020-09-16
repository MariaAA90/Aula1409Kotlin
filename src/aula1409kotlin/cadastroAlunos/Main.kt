package aula1409kotlin.cadastroAlunos

fun main(){

    val aluno1 = Aluno("1234","Maria","Armelin")
    val aluno2 = Aluno("4321","Marcos", "Silva")
    val materia1 = Materia("Kotlin")
    val materia2 = Materia("GIT")
    val professor = Professor("Girafales", "12345")
    val aula1 = Aula(materia1,"14:00h","17:30h")
    val aula2 = Aula(materia2, "13:50h","17:00h")
    val curso = Curso("Desenvolvimento para Android", professor,
        mutableListOf(aula1, aula2),mutableListOf(aluno1, aluno2))
    val turma1 = Turma("Turma da tarde", curso)
    val turma2 = Turma("Turma da manhã", curso)

    professor.fazerChamada(turma1)
    professor.darAula(aula1, turma1)
    professor.darAula(aula2, turma1)
    professor.fazerChamada(turma2)
    professor.darAula(aula2, turma2)
    aluno1.assistirAula(aula1)
    aluno2.assistirAula(aula2)
    aluno1.fazerLicao(materia1)
    aluno2.fazerLicao(materia2)


}


