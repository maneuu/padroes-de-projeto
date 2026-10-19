public class PagamentoCartaoCredito implements PagamentoStrategy {
    private final String numero;
    private final String validade;
    private final String codigoSeguranca;

    public PagamentoCartaoCredito(
            String numero,
            String validade,
            String codigoSeguranca) {
        this.numero = numero;
        this.validade = validade;
        this.codigoSeguranca = codigoSeguranca;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Validando dados do cartão...");
        System.out.println("Pagamento de R$ " + valor
                + " realizado via cartão de crédito.");
    }
}
