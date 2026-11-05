public class Main {
    public static void main(String[] args) {
        Relatorio relatorioHTML = new RelatorioHTML();
        Relatorio relatorioPDF = new RelatorioPDF();

        System.out.println("Gerando relatorio HTML:");
        relatorioHTML.gerarRelatorio();

        System.out.println();

        System.out.println("Gerando relatorio PDF:");
        relatorioPDF.gerarRelatorio();
    }
}
