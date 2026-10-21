package src;

public class FabricaChile implements IFabrica{
    
    public IDocumento criarDocumentoFiscal() { 

        return new DocumentoBoleta(); 
    }
    public IPagamento criarPagamento() {

        return new PagamentoWebPay(); 
    }
    public IComprovante criarComprovante() { 

        return new ComprovanteRUT(); 
    }
}
