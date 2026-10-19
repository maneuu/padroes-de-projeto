public class Main {
    public static void main(String[] args) {
        Navegador navegador = new Navegador(new RotaDeCarro());

        System.out.println("Rota de carro:");
        System.out.println(navegador.calcularRota("Casa", "Trabalho"));

        navegador.definirEstrategia(new RotaDeTransportePublico());
        System.out.println("\nRota de transporte publico:");
        System.out.println(navegador.calcularRota("Casa", "Trabalho"));

        navegador.definirEstrategia(new RotaAPe());
        System.out.println("\nRota a pe:");
        System.out.println(navegador.calcularRota("Casa", "Trabalho"));
    }
}
