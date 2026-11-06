public class Main {
    public static void main(String[] args) {
        Aprovador funcionario = new Funcionario();
        Aprovador gerente = new Gerente();
        Aprovador diretor = new Diretor();
        // fluxo será funcionario(1000) -> gerente(5000) -> diretor(SEM LIMITE)
        funcionario.definirProximo(gerente);
        gerente.definirProximo(diretor);
        // diretor é o último da cadeia, então não precisa definir próximo

        funcionario.aprovar(new Despesa("Material de escritorio", 500.00)); // aprovado pelo funcionario
        funcionario.aprovar(new Despesa("Equipamento novo", 2500.00)); // aprovado pelo gerente
        funcionario.aprovar(new Despesa("Reforma da filial", 12000.00)); // aprovado pelo diretor
    }
}
