public class Leite extends ComplementoDecorator {
    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", leite";
    }

    @Override
    public double getCusto() {
        return bebida.getCusto() + 1.50;
    }
}
