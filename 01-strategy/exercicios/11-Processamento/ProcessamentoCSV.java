public class ProcessamentoCSV implements ProcessamentoStrategy {
    private final String separador;
    private final String charset;

    public ProcessamentoCSV(String separador, String charset) {
        this.separador = separador;
        this.charset = charset;
    }

    @Override
    public void processar(String conteudo) {
        System.out.println("[" + TIPO_PADRAO + "] CSV");
        System.out.println("Separador: " + separador);
        System.out.println("Charset: " + charset);
        System.out.println("Conteúdo: " + conteudo.replace(";", separador));
    }
}
