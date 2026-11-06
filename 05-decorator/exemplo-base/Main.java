public class Main {
    public static void main(String[] args) {
        // O componente concreto fornece o comportamento original.
        Componente componente = new ComponenteConcreto();

        // O decorator envolve o componente sem alterar sua classe.
        componente = new DecoratorConcreto(componente);

        // O objeto continua sendo tratado pelo tipo Componente.
        System.out.println(componente.executar());
    }
}
