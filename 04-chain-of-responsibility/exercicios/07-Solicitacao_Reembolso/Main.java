public class Main {
    public static void main(String[] args) {
        AprovadorReembolso coordenador = new Coordenador();
        AprovadorReembolso gerente = new Gerente();
        AprovadorReembolso diretor = new Diretor();

        // Fluxo: coordenador(500) -> gerente(3000) -> diretor(sem limite).
        coordenador.definirProximo(gerente)
                .definirProximo(diretor);

        coordenador.aprovar(new Reembolso(
                "Ana", "Alimentacao em viagem", 180.00));
        coordenador.aprovar(new Reembolso(
                "Bruno", "Hospedagem em evento", 1500.00));
        coordenador.aprovar(new Reembolso(
                "Carla", "Despesas de representacao", 7500.00));
    }
}
