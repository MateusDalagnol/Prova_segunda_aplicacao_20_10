package src;

public class FabricaBrasil implements IFabrica{

    public IDocumento criarDocumentoFiscal() { 

        return new DocumentoNFe(); 
    }
    public IPagamento criarPagamento() {

        return new PagamentoPIX(); 
    }
    public IComprovante criarComprovante() { 

        return new ComprovanteCPF(); 
    }
}
