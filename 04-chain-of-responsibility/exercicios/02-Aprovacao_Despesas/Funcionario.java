public class Funcionario extends Aprovador {
    private static final double LIMITE = 1000.00;

    @Override
    public void aprovar(Despesa despesa) {
        if (despesa.getValor() <= LIMITE) {
            System.out.printf("Funcionario aprovou: %s (R$ %.2f)%n",
                    despesa.getDescricao(), despesa.getValor());
            return;
        }

        encaminhar(despesa);
    }
}
