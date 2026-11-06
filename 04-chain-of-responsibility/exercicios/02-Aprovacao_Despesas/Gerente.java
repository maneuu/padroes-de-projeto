public class Gerente extends Aprovador {
    private static final double LIMITE = 5000.00;

    @Override
    public void aprovar(Despesa despesa) {
        if (despesa.getValor() <= LIMITE) {
            System.out.printf("Gerente aprovou: %s (R$ %.2f)%n",
                    despesa.getDescricao(), despesa.getValor());
            return;
        }

        encaminhar(despesa);
    }
}
