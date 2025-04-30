package lanchonete.area.cliente;

public class Cliente {
    public void escolherLanche(){
        System.out.println("Escolhendo o lanche");
    }
    public void fazerPedido(){
        System.out.println("Fazendo o pedido");
    }
    private void consultarSaldoAplicativo(){
        System.out.println("Consultando saldo aplicativo");
    }
    public void pegarPedidoBalcao() {
        System.out.println("Pegando pedido balcao");
    }
    public void pagarConta(){
        consultarSaldoAplicativo();
        System.out.println("Cliente pagando conta");
    }
}
