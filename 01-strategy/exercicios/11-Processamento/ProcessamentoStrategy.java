public interface ProcessamentoStrategy {
    String TIPO_PADRAO = "PROCESSAMENTO";

    void processar(String conteudo);
}
