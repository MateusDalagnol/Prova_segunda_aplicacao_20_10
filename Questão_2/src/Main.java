package src;

public class Main {
    public static void main(String[] args) {
        Matricula brasil = new Matricula(new FabricaBrasil(), "Edivan", "123.456.789-09", 10000.00);
        Matricula chile = new Matricula(new FabricaChile(), "Matios", "12.345.678-5", 0.00);

        brasil.confirmar();
        chile.confirmar();
    }
}