public class Ativa implements EstadoConta {
    @Override
    public void depositar(ContaBancaria conta, double valor) {
        conta.adicionarSaldo(valor);
        System.out.printf("Deposito realizado: R$ %.2f%n", valor);
    }

    @Override
    public void sacar(ContaBancaria conta, double valor) {
        if (!conta.possuiSaldo(valor)) {
            System.out.println("Saldo insuficiente.");
            return;
        }

        conta.retirarSaldo(valor);
        System.out.printf("Saque realizado: R$ %.2f%n", valor);
    }

    @Override
    public void bloquear(ContaBancaria conta) {
        System.out.println("Conta bloqueada.");
        conta.definirEstado(new Bloqueada());
    }

    @Override
    public void desbloquear(ContaBancaria conta) {
        System.out.println("A conta ja esta ativa.");
    }

    @Override
    public void exibirStatus() {
        System.out.println("Estado atual: Ativa");
    }
}
