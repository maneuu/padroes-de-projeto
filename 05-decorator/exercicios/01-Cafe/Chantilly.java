public class Chantilly extends ComplementoDecorator {
    public Chantilly(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", chantilly";
    }

    @Override
    public double getCusto() {
        return bebida.getCusto() + 2.00;
    }
}
