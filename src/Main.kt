import controller.AlunoController
import repository.AlunoRepository
import service.AlunoService

fun main() {
    // Instances
    val alunoRepository = AlunoRepository()
    val alunoService = AlunoService(alunoRepository)
    val alunoController = AlunoController(alunoService)

    // Cadastrando alunos
    alunoController.cadastrarAluno(
        id = "123",
        nome = "Joao",
        idade = 20,
        curso = "ADS",
        nota = 10.0
    )

    println("\n\n")

    alunoController.cadastrarAluno(
        id = "abc",
        nome = "Ana",
        idade = 22,
        curso = "Arquitetura",
        nota = 9.9
    )

    // Listando alunos
    // alunoController.listarAlunos()

    //alunoController.buscarAlunoID("123");
//    alunoController.buscarAluno("Ana")
//    alunoController.removerAlunoID("abc")
    alunoController.listarAlunos()
    println("\n\n")
    alunoController.alterarAluno(
        id = "123",
        nome = "Ana Joana",
        idade = 25,
        curso = "ads",
        nota = 5.5
    )
    println("\n\n")
    alunoController.listarAlunos()
}
