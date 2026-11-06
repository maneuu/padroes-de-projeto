public abstract class Decorator implements Componente {
    // O decorator guarda outro Componente para poder delegar a operacao.
    protected final Componente componente;

    protected Decorator(Componente componente) {
        this.componente = componente;
    }
}
