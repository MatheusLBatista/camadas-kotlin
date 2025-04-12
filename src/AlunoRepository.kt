class AlunoRepository {
    private val alunos = mutableListOf<Aluno>()

    fun cadastrarAluno(aluno: Aluno) {
        alunos.add(aluno)
        println("Aluno: ${aluno.nome} cadastrado com sucesso!")
    }

    fun listarAlunos(): List<Aluno> {
        return alunos
    }

    // Buscar aluno pelo nome, retorna o aluno ou null
    fun buscarAlunoNome(nome: String): Aluno? {
        return alunos.find { it.nome == nome }
    }

    // Buscar aluno pelo nome e imprimir se encontrado
    fun buscarAlunoNomeComMensagem(nome: String): Aluno? {
        val aluno = alunos.find { it.nome == nome }
        if (aluno != null) {
            println("Aluno encontrado: ${aluno.nome}")
            return aluno
        } else {
            println("Aluno não encontrado.")
            return null
        }
    }

    fun buscarAlunoID(id: String): Aluno?{
        return alunos.find { it.id == id };
    }

    fun removerAlunoID(id: String) {
        val alunoID = alunos.find { it.id == id };

        alunos.remove(alunoID);

        println("Aluno: ${alunoID} removido com sucesso!")
        println(alunos);
    }

    fun alterarAluno(aluno: Aluno): Aluno?{
        val alunoID = alunos.find { it.id == aluno.id };
        //return alunoID;
        return alunoID;

        //return alunos.replaceAll(id == alunoID);

        //println("Aluno: ${aluno.nome} cadastrado com sucesso!")
    }

}
