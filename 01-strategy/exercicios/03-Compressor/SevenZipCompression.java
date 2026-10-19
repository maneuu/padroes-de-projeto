/**
 * Concrete Strategy: comprime o arquivo no formato 7Z.
 */
public class SevenZipCompression implements CompressionStrategy {
    @Override
    public String compress(String fileName) {
        return "Arquivo " + fileName + " comprimido no formato 7Z.";
    }
}
