public class MaquinaDeBanho {
    private boolean limpo = true;

    private int agua = 30;

    private int shampoo = 10;

    private Pet pet;

    public void darBanho(){
        if (this.pet == null){
            System.out.println("Coloque o pet na maquina para iniciar o banho");
            return;

        }
        this.agua -= 10;
        this.shampoo -= 2;
        pet.setLimpo(true);
        System.out.println("O pet " + pet.getNome() + " está limpo");
    }

    public void adicionarAgua(){
        if (agua == 30){
            System.out.println("A capacidade de agua da maquina está no maximo");
            return;
        }
        agua+=2;
    }
    public void adicionarShampoo(){
        if (shampoo == 10){
            System.out.println("A capacidade de shampoo da maquina está no maximo");
            return;
        }
        shampoo+=2;
    }

    public int getAgua() {
        return agua;
    }

    public int getShampoo() {
        return shampoo;
    }
    public boolean temPet(){
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.limpo){
            System.out.println("A maquina está suja, para colocar o pet é necessario limpar" );
            return;

        }
        if (temPet()) {
            System.out.println("O pet " + this.pet.getNome() + " está na maquina nesse momento ");
            return;
        }

        this.pet = pet;
        System.out.println("O pet " + pet.getNome() + " foi colocado com sucesso!");
    }
    public void retirarPet(){
        this.limpo = this.pet.estaLimpo();
        System.out.println("O pet " + this.pet.getNome() + " foi tirado da maquina");
        this.pet = null;
    }
    public void limparMaquina(){
        this.agua -= 3;
        this.shampoo -= 1;
        this.limpo = true;
        System.out.println("A maquina está limpa");
    }
}
