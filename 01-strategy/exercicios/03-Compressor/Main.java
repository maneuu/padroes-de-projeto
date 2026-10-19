public class Main {
    public static void main(String[] args) {
        FileCompressionTools tools =
                new FileCompressionTools(new ZipCompression());

        System.out.println(tools.compress("relatorio.pdf"));

        tools.setStrategy(new RarCompression());
        System.out.println(tools.compress("fotos"));

        tools.setStrategy(new SevenZipCompression());
        System.out.println(tools.compress("projeto"));
    }
}
