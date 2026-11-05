public class Main {
    public static void main(String[] args) {
        CasaTemplate casaDeAlvenaria = new CasaDeAlvenaria();
        CasaTemplate casaDeMadeira = new CasaDeMadeira();

        System.out.println("Construindo casa de alvenaria:");
        casaDeAlvenaria.construirCasa();

        System.out.println();

        System.out.println("Construindo casa de madeira:");
        casaDeMadeira.construirCasa();
    }
}
