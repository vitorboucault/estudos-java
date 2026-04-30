public non-sealed class Vendedor extends Empregado {

    private double porcentagemPorVenda;

    private double totalVendido;

    public Vendedor(String codigo,
                    String nome,
                    String endereco,
                    int idade,
                    double salario,
                    double porcentagemPorVenda,
                    double totalVendido) {
        super(codigo, nome, endereco, idade, salario);
        this.porcentagemPorVenda = porcentagemPorVenda;
        this.totalVendido = totalVendido;
    }

    @Override
    public String getCodigo() {
        return "VENDEDOR" + super.getCodigo();
    }

    @Override
    public double getCalcularSalarioTotal() {
        return this.salario + this.totalVendido;
    }

    public Vendedor(){

    }

    public double getPorcentagemPorVenda() {
        return porcentagemPorVenda;
    }

    public void setPorcentagemPorVenda(double porcentagemPorVenda) {
        this.porcentagemPorVenda = porcentagemPorVenda;
    }

    public double getTotalVendido() {
        return totalVendido;
    }

    public void setTotalVendido(double totalVendido) {
        this.totalVendido = totalVendido;
    }



}
