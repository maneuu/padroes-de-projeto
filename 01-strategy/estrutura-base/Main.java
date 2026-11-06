// Demonstra a estrutura do padrão Strategy sem um exemplo de negócio.
public class Main {
    public static void main(String[] args) {
        Contexto contexto = new Contexto(new EstrategiaConcretaA());
        System.out.println(contexto.executar());

        contexto.definirEstrategia(new EstrategiaConcretaB());
        System.out.println(contexto.executar());

        contexto.definirEstrategia(new EstrategiaConcretaC());
        System.out.println(contexto.executar());
    }
}
