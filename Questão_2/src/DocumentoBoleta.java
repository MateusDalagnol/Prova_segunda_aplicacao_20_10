package src;
public class DocumentoBoleta implements IDocumento{

    public void emitir(double valor) {

        System.out.println("Boleta electronica emitida: " + valor * 0.19);
    }
}
