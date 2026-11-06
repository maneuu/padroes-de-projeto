public interface EstadoConta {
    void depositar(ContaBancaria conta, double valor);

    void sacar(ContaBancaria conta, double valor);

    void bloquear(ContaBancaria conta);

    void desbloquear(ContaBancaria conta);

    void exibirStatus();
}
