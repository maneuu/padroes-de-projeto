public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(100.00);

        conta.depositar(50.00);
        conta.sacar(30.00);
        conta.exibirSaldo();

        conta.bloquear();
        conta.sacar(20.00);
        conta.depositar(100.00);

        conta.desbloquear();
        conta.depositar(100.00);
        conta.exibirSaldo();
    }
}
