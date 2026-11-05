public class Acucar extends ComplementoDecorator {
    public Acucar(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", acucar";
    }

    @Override
    public double getCusto() {
        return bebida.getCusto() + 0.50;
    }
}
