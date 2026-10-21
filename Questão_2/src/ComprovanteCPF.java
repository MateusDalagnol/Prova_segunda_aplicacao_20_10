package src;

public class ComprovanteCPF implements IComprovante{

    public void gerar(String aluno, String identificacao) {
        
        System.out.println("Comprovante de matricula aluno: " + aluno + " CPF: " + identificacao);
    }
}
