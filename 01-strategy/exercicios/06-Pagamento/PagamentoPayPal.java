public class PagamentoPayPal implements PagamentoStrategy {
    private final String email;
    private final String senha;

    public PagamentoPayPal(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Validando email e senha do PayPal...");
        System.out.println("Autenticando no PayPal...");
        System.out.println("Pagamento de R$ " + valor + " realizado via PayPal.");
    }
}
