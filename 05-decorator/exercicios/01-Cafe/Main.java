public class Main {
    public static void main(String[] args) {
        Bebida cafe = new Cafe();
        cafe = new Leite(cafe);
        cafe = new Acucar(cafe);
        cafe = new Chantilly(cafe);

        System.out.println("Pedido: " + cafe.getDescricao());
        System.out.printf("Total: R$ %.2f%n", cafe.getCusto());
    }
}
