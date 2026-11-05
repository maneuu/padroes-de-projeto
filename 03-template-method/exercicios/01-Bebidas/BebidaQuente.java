public abstract class BebidaQuente {
    // Template Method: define a ordem fixa de preparo de qualquer bebida quente.
    // As subclasses podem variar alguns passos, mas nao podem mudar esta ordem.
    public final void prepararBebida() {
        ferverAgua();
        prepararIngredientePrincipal();
        colocarNaXicara();
        adicionarCondimentos();
    }

    // Este passo e igual para todas as bebidas e fica protegido na classe base.
    private void ferverAgua() {
        System.out.println("Fervendo a agua");
    }

    // Cada bebida precisa implementar sua forma de preparar o ingrediente principal.
    protected abstract void prepararIngredientePrincipal();

    // Este passo tambem e comum a todas as bebidas.
    private void colocarNaXicara() {
        System.out.println("Colocando a bebida na xicara");
    }

    // Hook: passo opcional que uma subclasse pode sobrescrever.
    protected void adicionarCondimentos() {}
}
