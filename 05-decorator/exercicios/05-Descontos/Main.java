public class Main {
    public static void main(String[] args) {
        Preco preco = new PrecoOriginal("Notebook", 3000.00);
        preco = new DescontoNatal(preco);
        preco = new DescontoClienteVIP(preco);

        System.out.println("Produto: " + preco.getDescricao());
        System.out.printf("Preco final: R$ %.2f%n", preco.getValor());
    }
}
