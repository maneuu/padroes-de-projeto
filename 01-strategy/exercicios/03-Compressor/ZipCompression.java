/**
 * Concrete Strategy: comprime o arquivo no formato ZIP.
 */
public class ZipCompression implements CompressionStrategy {
    @Override
    public String compress(String fileName) {
        return "Arquivo " + fileName + " comprimido no formato ZIP.";
    }
}
