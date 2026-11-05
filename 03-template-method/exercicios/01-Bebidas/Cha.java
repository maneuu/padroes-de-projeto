public class Cha extends BebidaQuente {
    // A classe Cha herda o algoritmo prepararBebida() da classe base.
    // Ela precisa apenas informar como preparar o seu ingrediente principal.
    @Override
    protected void prepararIngredientePrincipal() {
        System.out.println("Deixando o sache de cha em infusao");
    }

    // Este e um hook: o algoritmo permite um condimento opcional.
    // O cha sobrescreve o comportamento vazio e adiciona limao.
    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando limao");
    }
}
