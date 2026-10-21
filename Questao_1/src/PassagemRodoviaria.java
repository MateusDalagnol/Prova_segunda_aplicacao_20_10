package src;
public class PassagemRodoviaria implements IPassagem {
    private String passageiro;
    private double tarifa;

    public PassagemRodoviaria(String passageiro, double tarifa) {
        this.passageiro = passageiro;
        this.tarifa = tarifa;
    }

    public String getModal() {
        return "Rodoviario";
    }

    public String getPassageiro() {
        return passageiro; 
    }

    public double calcularTaxaEmbarque() {
        return tarifa * 0.03; 
    }

    public String getDocumentosExigidos() {
        return "documento de identidade com foto";
    }
}