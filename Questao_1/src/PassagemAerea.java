package src;
public class PassagemAerea implements IPassagem {
    private String passageiro;
    private double tarifa;

    public PassagemAerea(String passageiro, double tarifa) {
        this.passageiro = passageiro;
        this.tarifa = tarifa;
    }

    public String getModal() { 
        return "Aereo"; }

    public String getPassageiro() { 
        return passageiro; }

    public double calcularTaxaEmbarque() { 
        return tarifa * 0.08; }

    public String getDocumentosExigidos() {
        return "documento de identidade com foto e bilhete eletronico (e-ticket)";
    }
}