package src;
public class PassagemFerroviaria implements IPassagem {
    private String passageiro;
    private double tarifa;

    public PassagemFerroviaria(String passageiro, double tarifa) {
        this.passageiro = passageiro;
        this.tarifa = tarifa;
    }

    public String getModal() {
        return "Ferroviario"; 
    }

    public String getPassageiro() { 
        return passageiro; 
    }

    public double calcularTaxaEmbarque() { 
        return tarifa * 0.05; 
    }

    public String getDocumentosExigidos() {
        return "documento de identidade com foto e comprovante de reserva";
    }
}