package src;
public class ComprovanteRUT implements IComprovante{
    
    public void gerar(String aluno, String identificacao) {

        System.out.println("Comprovante de matricula aluno: " + aluno + " RUT: " + identificacao);
    }
}
