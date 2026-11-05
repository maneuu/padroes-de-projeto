public abstract class ComplementoDecorator implements Bebida {
    protected final Bebida bebida;

    protected ComplementoDecorator(Bebida bebida) {
        this.bebida = bebida;
    }
}
