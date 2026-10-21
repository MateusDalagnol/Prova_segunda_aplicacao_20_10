package src;
public class DocumentoNFe implements IDocumento { 
    
    public void emitir(double valor) {  
        
        System.out.println("NFe emitida: " + valor * 0.05);
    }
}