package lanchonete.atendimento.cozinha;

public class Cozinheiro {
    public void adicionarLancheNoBalcao() {
        System.out.println("Adicionando lanche no balcao");
    }
    public void adicionarSucoNoBalcao() {
        System.out.println("Adicionando suco no balcao");
    }
    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    private void prepararLanche() {
        System.out.println("Preparando lanche tipo hamburguer");
    }
    private void prepararVitamina() {
        System.out.println("Preparando vitamina");
    }
    private void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }
    void selecionarIngredientesLanche() {
        System.out.println("Selecionando pao, alface, carne, queijo");
    }
    private void selecionarIngredientesVitamina() {
        System.out.println("Selecionando fruta, leite e suco");
    }
    private void lavarIngredientes() {
        System.out.println("Lavando ingredientes");
    }
    private void baterVitaminaLiquidificador() {
        System.out.println("Bater vitamina liquidificador");
    }
    private void fritarIngredientesLanche() {
        System.out.println("Fritar carne do hamburguer");
    }
    private void pedirPraTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }
    private void pedirIngredientes(Almoxarife meuAmigo) {
        meuAmigo.entregarIngredientes();
    }
}
