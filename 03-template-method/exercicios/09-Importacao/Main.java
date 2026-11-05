public class Main {
    public static void main(String[] args) {
        ImportacaoArquivo importacaoCSV = new ImportacaoCSV();
        ImportacaoArquivo importacaoJSON = new ImportacaoJSON();

        System.out.println("Importando arquivo CSV:");
        importacaoCSV.importarArquivo();

        System.out.println();

        System.out.println("Importando arquivo JSON:");
        importacaoJSON.importarArquivo();
    }
}
