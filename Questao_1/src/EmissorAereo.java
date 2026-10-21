package src;
public class EmissorAereo implements IEmissor {

    public IPassagem criarPassagem(String passageiro, double tarifa) {
        return new PassagemAerea(passageiro, tarifa);
    }
}