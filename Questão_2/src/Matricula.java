package src;
public class Matricula {
    private IFabrica fabrica;
    private String aluno;
    private String identificacao;
    private double valor;

    public Matricula(IFabrica fabrica, String aluno, String identificacao, double valor) {
        this.fabrica = fabrica;
        this.aluno = aluno;
        this.identificacao = identificacao;
        this.valor = valor;
    }

    public void confirmar() {
        IDocumento documento = fabrica.criarDocumentoFiscal();
        IPagamento pagamento = fabrica.criarPagamento();
        IComprovante comprovante = fabrica.criarComprovante();

        // RF03: relatorio com a descricao dos tres artefatos
        System.out.println("=== Relatorio da matricula ===");
        documento.emitir(valor);
        pagamento.processar(valor);
        comprovante.gerar(aluno, identificacao);
    }
}
