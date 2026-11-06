public class Diretor extends Aprovador {
    @Override
    public void aprovar(Despesa despesa) {
        System.out.printf("Diretor aprovou: %s (R$ %.2f)%n",
                despesa.getDescricao(), despesa.getValor());
    }
}
