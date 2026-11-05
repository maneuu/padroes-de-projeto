public abstract class Refeicao {
    // Template Method: define a ordem fixa de preparacao da refeicao.
    public final void prepararRefeicao() {
        separarIngredientes();
        prepararIngredientePrincipal();
        cozinhar();
        servir();
        adicionarAcompanhamento();
    }

    // Cada refeicao possui ingredientes diferentes.
    protected abstract void separarIngredientes();

    // O ingrediente principal varia conforme a refeicao.
    protected abstract void prepararIngredientePrincipal();

    // Cada refeicao pode usar uma tecnica de cozimento diferente.
    protected abstract void cozinhar();

    // Etapa comum para qualquer refeicao.
    private void servir() {
        System.out.println("Servindo a refeicao");
    }

    // Hook: o acompanhamento e opcional.
    protected void adicionarAcompanhamento() {}
}
