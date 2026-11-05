public class CasaDeMadeira extends CasaTemplate {
    @Override
    protected void construirEstrutura() {
        System.out.println("Montando a estrutura com vigas de madeira");
    }

    @Override
    protected void instalarTelhado() {
        System.out.println("Instalando telhado de madeira");
    }

    @Override
    protected void instalarPortasEJanelas() {
        System.out.println("Instalando portas e janelas de madeira");
    }

    @Override
    protected void decorar() {
        System.out.println("Aplicando verniz nas paredes");
    }
}
