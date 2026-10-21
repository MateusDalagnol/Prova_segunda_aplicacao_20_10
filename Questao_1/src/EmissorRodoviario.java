package src;

public class EmissorRodoviario implements IEmissor {

    public IPassagem criarPassagem(String passageiro, double tarifa) {
        return new PassagemRodoviaria(passageiro, tarifa);
    }
}

