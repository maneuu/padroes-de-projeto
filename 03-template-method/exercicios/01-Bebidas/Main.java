public class Main {
    public static void main(String[] args) {
        System.out.println("Preparando cafe:");
        // A referencia usa o tipo abstrato, mas o comportamento vem de Cafe.
        BebidaQuente cafe = new Cafe();
        cafe.prepararBebida();

        System.out.println("\nPreparando cha:");
        // O mesmo algoritmo e reutilizado por Cha, com passos personalizados.
        BebidaQuente cha = new Cha();
        cha.prepararBebida();
    }
}
