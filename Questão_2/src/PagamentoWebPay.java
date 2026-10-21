package src;
public class PagamentoWebPay implements IPagamento{

    public void processar(double valor) {

        System.out.println( "Pagamento Webpay processado: " + valor);
    }
}
