public class CasaDeAlvenaria extends CasaTemplate {
    @Override
    protected void construirEstrutura() {
        System.out.println("Construindo a estrutura com tijolos e cimento");
    }

    @Override
    protected void instalarTelhado() {
        System.out.println("Instalando telhado de telhas ceramicas");
    }

    @Override
    protected void instalarPortasEJanelas() {
        System.out.println("Instalando portas e janelas de aluminio");
    }

    @Override
    protected void decorar() {
        System.out.println("Pintando as paredes");
    }
}
