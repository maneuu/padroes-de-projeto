public class ContaBancaria {
    private EstadoConta estado;
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
        this.estado = new Ativa();
        estado.exibirStatus();
    }

    public void depositar(double valor) {
        estado.depositar(this, valor);
    }

    public void sacar(double valor) {
        estado.sacar(this, valor);
    }

    public void bloquear() {
        estado.bloquear(this);
    }

    public void desbloquear() {
        estado.desbloquear(this);
    }

    public void definirEstado(EstadoConta estado) {
        this.estado = estado;
        estado.exibirStatus();
    }

    public void adicionarSaldo(double valor) {
        saldo += valor;
    }

    public boolean possuiSaldo(double valor) {
        return saldo >= valor;
    }

    public void retirarSaldo(double valor) {
        saldo -= valor;
    }

    public void exibirSaldo() {
        System.out.printf("Saldo: R$ %.2f%n", saldo);
    }
}
