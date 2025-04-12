import java.util.UUID;

class Aluno (val id: String, val nome: String, val idade: Int, val curso: String, val nota: Double) {

    fun exibirDados(){
        println("ID: $id")
        println("Nome: $nome")
        println("Idade: $idade")
        println("Curso: $curso")
        println("Nota: $nota")
    }

    companion object {
        fun getIdUnico(): String {
            return UUID.randomUUID().toString();
        }
    }


}