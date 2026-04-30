public class Main {
    public static void main(String[] args) {

        imprimirEmpregado(new Gerente());
        imprimirEmpregado(new Vendedor());
    }
    public static void imprimirEmpregado(Empregado empregado) {

        System.out.printf("=======%s=======\n", empregado.getClass().getCanonicalName());

        switch (empregado){
            case Gerente gerente ->{
                gerente.setCodigo("123");
                gerente.setNome("Joao");
                gerente.setSalario(5000);
                gerente.setLogin("joao");
                gerente.setSenha("123456");
                gerente.setComissao(1200);

                System.out.println(empregado.getCodigo());
                System.out.println(empregado.getNome());
                System.out.println(empregado.getSalario());
                System.out.println(gerente.getLogin());
                System.out.println(gerente.getSenha());
                System.out.println(gerente.getComissao());
            }
            case Vendedor vendedor ->{
                vendedor.setCodigo("456");
                vendedor.setNome("Cleiton");
                vendedor.setSalario(2800);
                vendedor.setPorcentagemPorVenda(10);
                vendedor.setTotalVendido(1000);


                System.out.println(vendedor.getCodigo());
                System.out.println(vendedor.getNome());
                System.out.println(vendedor.getSalario());
                System.out.println(vendedor.getPorcentagemPorVenda());
                System.out.println(vendedor.getTotalVendido());
            }
        }
        System.out.println(empregado.getCalcularSalarioTotal());
        System.out.println("==============");
    }
}
