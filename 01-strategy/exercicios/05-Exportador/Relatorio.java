public class Relatorio {
    private final String titulo;
    private final String[] dados;
    private ExportacaoStrategy estrategia;

    public Relatorio(String titulo, String[] dados, ExportacaoStrategy estrategia) {
        this.titulo = titulo;
        this.dados = dados;
        this.estrategia = estrategia;
    }

    public void definirExportacao(ExportacaoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void exportar() {
        estrategia.exportar(titulo, dados);
    }
}
