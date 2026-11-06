public class RodapeDecorator extends RelatorioDecorator {
    public RodapeDecorator(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String gerar() {
        return relatorio.gerar() + "\n--- Fim do relatorio ---";
    }
}
