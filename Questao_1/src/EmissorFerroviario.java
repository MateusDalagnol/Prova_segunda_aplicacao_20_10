package src;
public class EmissorFerroviario implements IEmissor {

    public IPassagem criarPassagem(String passageiro, double tarifa) {
        return new PassagemFerroviaria(passageiro, tarifa);
    }
}
