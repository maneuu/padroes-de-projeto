public class Main {
    public static void main(String[] args) {
        String texto = "Padroes de projeto";

        // O contexto comeca usando a estrategia de letras maiusculas.
        EditorDeTexto editor = new EditorDeTexto();
        editor.definirEstrategia(new FormatacaoMaiuscula());
        System.out.println(editor.formatar(texto));

        // A estrategia pode ser trocada sem alterar o EditorDeTexto.
        editor.definirEstrategia(new FormatacaoMinuscula());
        System.out.println(editor.formatar(texto));

        // Uma nova estrategia tambem pode ser utilizada pelo mesmo contexto.
        editor.definirEstrategia(new FormatacaoComPrefixo());
        System.out.println(editor.formatar(texto));
    }
}
