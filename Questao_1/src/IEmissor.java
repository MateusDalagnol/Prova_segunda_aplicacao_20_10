package src;
public interface IEmissor {

    IPassagem criarPassagem(String passageiro, double tarifa);

    default void emitir(String passageiro, double tarifa) {
        IPassagem Ipassagem = criarPassagem(passageiro, tarifa);
        double taxa = Ipassagem.calcularTaxaEmbarque();

        System.out.println("Modal: " + Ipassagem.getModal());
        System.out.println("Passageiro: " + Ipassagem.getPassageiro());
        System.out.println("Taxa de embarque: R$ " + taxa);
        System.out.println("Documentos exigidos: " + Ipassagem.getDocumentosExigidos());
        System.out.println("------------------------------");
    }

}
