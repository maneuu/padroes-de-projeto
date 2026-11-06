public class DecoratorConcreto extends Decorator {
        public DecoratorConcreto(Componente componente) {
            super(componente);
        }

    @Override
    public String executar() {
        // Primeiro executa o componente interno e depois adiciona seu comportamento.
        return componente.executar() + " + comportamento do decorator";
    }
}
