public class ProcessamentoXML implements ProcessamentoStrategy {
    private final String versao;
    private final boolean comCabecalho;

    public ProcessamentoXML(String versao, boolean comCabecalho) {
        this.versao = versao;
        this.comCabecalho = comCabecalho;
    }

    @Override
    public void processar(String conteudo) {
        System.out.println("[" + TIPO_PADRAO + "] XML");
        System.out.println("Versão: " + versao);
        System.out.println("Cabecalho: " + comCabecalho);
        System.out.println("Conteúdo: <dados>" + conteudo + "</dados>");
    }
}
