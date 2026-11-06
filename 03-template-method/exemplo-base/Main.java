public class Main {
    public static void main(String[] args) {
        ProcessoTemplate processoA = new ProcessoConcretoA();
        ProcessoTemplate processoB = new ProcessoConcretoB();

        System.out.println("Executando o processo A:");
        processoA.executar();

        System.out.println();

        System.out.println("Executando o processo B:");
        processoB.executar();
    }
}
