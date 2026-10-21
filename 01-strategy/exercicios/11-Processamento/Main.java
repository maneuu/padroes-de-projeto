public class Main {
    public static void main(String[] args) {
        Processador processador = new Processador(
                new ProcessamentoCSV(";", "UTF-8"));

        processador.processar("nome;idade;cidade");

        processador.definirEstrategia(new ProcessamentoJSON(true, 4));
        processador.processar("usuario:joao");

        processador.definirEstrategia(new ProcessamentoXML("1.0", true));
        processador.processar("dados do cliente");
    }
}
