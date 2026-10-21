public class Processador {
    private ProcessamentoStrategy estrategia;

    public Processador(ProcessamentoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void definirEstrategia(ProcessamentoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void processar(String conteudo) {
        if (estrategia == null) {
            throw new IllegalStateException("Estratégia não definida");
        }

        System.out.println("Tipo comum: " + ProcessamentoStrategy.TIPO_PADRAO);
        estrategia.processar(conteudo);
    }
}
