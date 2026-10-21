package src;
public class PagamentoPIX implements IPagamento{

    public void processar(double valor) {

        System.out.println("Pagamento Pix processado: " + valor);
    }
}
