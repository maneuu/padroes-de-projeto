public class ExportacaoCSV implements ExportacaoStrategy {
    @Override
    public void exportar(String titulo, String[] dados) {
        System.out.println("Exportando CSV: " + titulo);
        System.out.print("titulo,valor\n");
        for (int i = 0; i < dados.length; i++) {
            System.out.println((i + 1) + "," + dados[i]);
        }
        System.out.println("[CSV] Arquivo salvo em: relatorio.csv");
    }
}
