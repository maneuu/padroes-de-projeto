public class ProcessamentoJSON implements ProcessamentoStrategy {
    private final boolean formatado;
    private final int indentacao;

    public ProcessamentoJSON(boolean formatado, int indentacao) {
        this.formatado = formatado;
        this.indentacao = indentacao;
    }

    @Override
    public void processar(String conteudo) {
        System.out.println("[" + TIPO_PADRAO + "] JSON");
        System.out.println("Formatado: " + formatado);
        System.out.println("Indentação: " + indentacao + " espaços");
        System.out.println("Conteúdo: {\"dados\": \"" + conteudo + "\"}");
    }
}
