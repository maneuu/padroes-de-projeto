public abstract class PrecoDecorator implements Preco {
    protected final Preco preco;

    protected PrecoDecorator(Preco preco) {
        this.preco = preco;
    }
}
