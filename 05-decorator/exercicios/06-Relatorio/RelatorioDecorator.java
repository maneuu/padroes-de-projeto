public abstract class RelatorioDecorator implements Relatorio {
    protected final Relatorio relatorio;

    protected RelatorioDecorator(Relatorio relatorio) {
        this.relatorio = relatorio;
    }
}
