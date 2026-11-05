public class Main {
    public static void main(String[] args) {
        Refeicao cafeDaManha = new CafeDaManha();
        Refeicao almoco = new Almoco();

        System.out.println("Preparando cafe da manha:");
        cafeDaManha.prepararRefeicao();

        System.out.println();

        System.out.println("Preparando almoco:");
        almoco.prepararRefeicao();
    }
}
