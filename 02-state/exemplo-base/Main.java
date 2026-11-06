public class Main {
    public static void main(String[] args) {
        // O contexto inicia no EstadoConcretoA.
        Contexto contexto = new Contexto();

        // Cada operacao e delegada ao estado atual.
        contexto.operar();
        contexto.operar();
        contexto.operar();
    }
}
