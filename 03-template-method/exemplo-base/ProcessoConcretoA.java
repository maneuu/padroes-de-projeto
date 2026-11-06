public class ProcessoConcretoA extends ProcessoTemplate {
    @Override
    protected void realizarEtapaPrincipal() {
        System.out.println("Executando a etapa principal do processo A");
    }

    @Override
    protected void opcional() {
        System.out.println("Executando a etapa opcional do processo A");
    }
}
