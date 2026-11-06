public class Main {
    public static void main(String[] args) {
        AprovadorCompra analista = new AnalistaCompras();
        AprovadorCompra gerente = new GerenteCompras();
        AprovadorCompra diretor = new DiretorFinanceiro();

        // Fluxo: analista(1000) -> gerente(5000) -> diretor(sem limite).
        analista.definirProximo(gerente)
                .definirProximo(diretor);

        analista.aprovar(new Compra("Material de escritorio", 750.00));
        analista.aprovar(new Compra("Computadores novos", 3500.00));
        analista.aprovar(new Compra("Maquinas para a fabrica", 15000.00));
    }
}
