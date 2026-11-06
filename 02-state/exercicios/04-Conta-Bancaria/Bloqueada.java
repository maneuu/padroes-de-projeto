public class Bloqueada implements EstadoConta {
    @Override
    public void depositar(ContaBancaria conta, double valor) {
        System.out.println("Nao e possivel depositar: a conta esta bloqueada.");
    }

    @Override
    public void sacar(ContaBancaria conta, double valor) {
        System.out.println("Nao e possivel sacar: a conta esta bloqueada.");
    }

    @Override
    public void bloquear(ContaBancaria conta) {
        System.out.println("A conta ja esta bloqueada.");
    }

    @Override
    public void desbloquear(ContaBancaria conta) {
        System.out.println("Conta desbloqueada.");
        conta.definirEstado(new Ativa());
    }

    @Override
    public void exibirStatus() {
        System.out.println("Estado atual: Bloqueada");
    }
}
