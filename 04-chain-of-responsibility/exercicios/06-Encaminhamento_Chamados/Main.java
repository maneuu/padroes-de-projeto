public class Main {
    public static void main(String[] args) {
        Encaminhador tecnico = new SuporteTecnico();
        Encaminhador financeiro = new SetorFinanceiro();
        Encaminhador comercial = new SetorComercial();
        Encaminhador ouvidoria = new Ouvidoria();

        // Fluxo: suporte tecnico -> financeiro -> comercial -> ouvidoria.
        tecnico.definirProximo(financeiro)
                .definirProximo(comercial)
                .definirProximo(ouvidoria);

        tecnico.encaminhar(new Chamado(
                "CH-001", "Aplicativo nao inicia", "tecnico"));
        tecnico.encaminhar(new Chamado(
                "CH-002", "Boleto com valor incorreto", "financeiro"));
        tecnico.encaminhar(new Chamado(
                "CH-003", "Duvida sobre plano empresarial", "comercial"));
        tecnico.encaminhar(new Chamado(
                "CH-004", "Reclamacao sobre atendimento", "ouvidoria"));
        tecnico.encaminhar(new Chamado(
                "CH-005", "Solicitacao sem categoria", "logistica"));
    }
}
