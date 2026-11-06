public class RelatorioBase implements Relatorio {
    private final String titulo;
    private final String conteudo;

    public RelatorioBase(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    @Override
    public String gerar() {
        return titulo + "\n" + conteudo;
    }
}
