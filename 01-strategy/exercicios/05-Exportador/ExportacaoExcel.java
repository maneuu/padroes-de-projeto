public class ExportacaoExcel implements ExportacaoStrategy {
    @Override
    public void exportar(String titulo, String[] dados) {
        System.out.println("Exportando Excel: " + titulo);
        System.out.println("[Excel] Planilha criada com 1 aba");
        System.out.println("[Excel] Linha 1: Titulo | Valor");
        for (int i = 0; i < dados.length; i++) {
            System.out.println("[Excel] Linha " + (i + 2) + ": " + (i + 1) + " | " + dados[i]);
        }
        System.out.println("[Excel] Arquivo salvo em: relatorio.xlsx");
    }
}
