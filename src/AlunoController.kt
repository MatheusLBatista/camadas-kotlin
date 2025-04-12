/*
    controller deve receber serviços e não repositórios via injeção de dependência
 */

/*class AlunoController (
    private val alunoService: AlunoService
) {
    fun cadastrarAluno(
        id: String,
        nome: String,
        idade: Int,
        curso: String,
        nota: Double
    ) {

        // TODO validacao de dados primarios
        val aluno = Aluno(
            id = id,
            nome = nome,
            idade = idade,
            curso = curso,
            nota = nota
        )

        alunoService.cadastrarAluno(aluno);
        //se fosse uma api teria um retorno para rota
        println("Aluno inserido com sucesso!")
    }

    fun listarAlunos(){
        val alunos = alunoService.listarAlunos()
        if (alunos.isEmpty()) {
            println("Nenhum aluno cadastrado")
        }
        else {
            println("Listando")
            alunos.forEach{ it.exibirDados()}
            println("Total de alunos: ${alunos.size}")

        }
    }

    fun buscarAluno(nome: String) {
        val aluno = alunoService.buscarAlunoNome(nome);

        if (aluno != null) {
            println("aluno encontrado")
            aluno().exibirDados()
        }
        else {
            println("Aluno nao encontrado")
        }
    }

    alunoController.buscarAlunoNome("Joao");

}*/

class AlunoController(
    private val alunoService: AlunoService
) {

    fun cadastrarAluno(
        id: String,
        nome: String,
        idade: Int,
        curso: String,
        nota: Double
    ) {
        // TODO: Validação de dados primários
        val aluno = Aluno(
            id = id,
            nome = nome,
            idade = idade,
            curso = curso,
            nota = nota
        )

        alunoService.cadastrarAluno(aluno)
        // Se fosse uma API, teria um retorno para a rota
        println("Aluno inserido com sucesso!")
    }

    fun listarAlunos() {
        val alunos = alunoService.listarAlunos()
        if (alunos.isEmpty()) {
            println("Nenhum aluno cadastrado")
        } else {
            println("Listando alunos:")
            alunos.forEach { it.exibirDados() }
            println("Total de alunos: ${alunos.size}")
        }
    }

    fun buscarAluno(nome: String) {
        val aluno = alunoService.buscarAlunoNome(nome);

        if (aluno != null) {
            println("Aluno encontrado: ")
            aluno.exibirDados()
        } else {
            println("Aluno não encontrado")
        }
    }

    fun buscarAlunoID(id: String){
        val aluno = alunoService.buscarAlunoID(id);

        if (aluno!= null){
            println("Aluno encontrado: ");
            aluno.exibirDados();
        } else {
            println("Aluno não encontrado!")
        }
    }

    fun removerAlunoID(id: String){
        val aluno = alunoService.removerAlunoID(id);

        if (aluno!= null){
            println("Aluno removido: ");
            //aluno.exibirDados();
        } else {
            println("Aluno não encontrado!")
        }
    }

    fun alterarAluno(
        id: String,
        nome: String,
        idade: Int,
        curso: String,
        nota: Double
    ) {
        // TODO: Validação de dados primários
        val aluno = Aluno(
            id = id,
            nome = nome,
            idade = idade,
            curso = curso,
            nota = nota
        )

        alunoService.alterarAluno(aluno);
        println("Aluno alterado com sucesso!")
    }
}

