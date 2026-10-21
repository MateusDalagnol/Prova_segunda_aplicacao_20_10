package src;

public class Main {
    public static void main(String[] args) {
        IEmissor aereo = new EmissorAereo();
        IEmissor rodoviario = new EmissorRodoviario();
        IEmissor ferroviario = new EmissorFerroviario();

        aereo.emitir("Leandro Escobar", 10.00);
        rodoviario.emitir("Mateus Dalagnol", 200.00);
        ferroviario.emitir("Edivan Alan", 500.00);
    }
}
