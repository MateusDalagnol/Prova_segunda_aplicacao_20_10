package src;

public interface IFabrica {

    IDocumento criarDocumentoFiscal();

    IPagamento criarPagamento();

    IComprovante criarComprovante();
}
