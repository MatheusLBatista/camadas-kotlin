class AlunoService(private val alunoRepository: AlunoRepository) {

    fun cadastrarAluno(aluno: Aluno): Aluno {
        //TODO validacao de dados com foco nas regras de negocio


        alunoRepository.cadastrarAluno(aluno)
        return aluno;
    }

    fun listarAlunos(): List<Aluno>{
        return alunoRepository.listarAlunos();
    }

    fun buscarAlunoNome(nome: String): Aluno? {
        return alunoRepository.buscarAlunoNome(nome);
    }

    fun buscarAlunoID(id: String): Aluno? {
        return alunoRepository.buscarAlunoID(id);
    }

    fun removerAlunoID(id: String) {
        return alunoRepository.removerAlunoID(id);
    }

    fun alterarAluno(aluno: Aluno): Aluno? {
        return alunoRepository.alterarAluno(aluno);
    }

}