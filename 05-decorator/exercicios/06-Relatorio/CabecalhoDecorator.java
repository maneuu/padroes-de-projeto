public class CabecalhoDecorator extends RelatorioDecorator {
    public CabecalhoDecorator(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String gerar() {
        return "=== RELATORIO DA EMPRESA ===\n" + relatorio.gerar();
    }
}
