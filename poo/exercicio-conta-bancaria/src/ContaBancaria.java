public class ContaBancaria {
    private double saldoConta;
    private double usadoChequeEspecial;
    private double limiteChequeEspecial;
    private double taxaDevida;


    public ContaBancaria(double depositoInicial) {
        this.saldoConta = depositoInicial;

        if (depositoInicial <= 500){
            this.limiteChequeEspecial = 50;
        }
        else {
            this.limiteChequeEspecial = depositoInicial * 0.5;
        }
    }
    public boolean sacar(double valorSaque){
        double disponivel = saldoConta + (limiteChequeEspecial - usadoChequeEspecial);

        if (valorSaque > disponivel){
            System.out.println(Mensagens.SEM_SALDO);
            return false;
        }
        if (valorSaque <= saldoConta){
            saldoConta -= valorSaque;
        }
        else {
            double excedente = valorSaque - saldoConta;
            saldoConta = 0;
            usadoChequeEspecial += excedente;
            taxaDevida += excedente * 0.2;
        }
        System.out.println(Mensagens.SAQUE_REALIZADO);
        return true;
    }
    public boolean pagarBoleto(double valorBoleto) {
        if (valorBoleto <= 0) {
            System.out.println(Mensagens.BOLETO_INVALIDO);
            return false;
        }
        boolean sucesso = sacar(valorBoleto);
        if (sucesso){
            System.out.println(Mensagens.PAG_BOLETO_REALIZADO);
        }
        return sucesso;
    }

    public boolean depositar(double valorDeposito){
        if (valorDeposito <= 0){
            System.out.println(Mensagens.DEPOSITO_INVALIDO);
            return false;
        }
        if (taxaDevida > 0){
            double pagamentoTaxa = Math.min(valorDeposito, taxaDevida);
            taxaDevida -= pagamentoTaxa;
            valorDeposito -= pagamentoTaxa;
            if (taxaDevida == 0){
                System.out.println(Mensagens.TAXA_QUITADA);
            }
        }
        if (valorDeposito > 0 && usadoChequeEspecial > 0){
            double pagamentoCheque = Math.min(valorDeposito, usadoChequeEspecial);
            usadoChequeEspecial -= pagamentoCheque;
            valorDeposito -= pagamentoCheque;
            if (usadoChequeEspecial == 0){
                System.out.println(Mensagens.CHEQUE_QUITADO);
            }
        }
        saldoConta += valorDeposito;
        System.out.println(Mensagens.DEPOSITO_SUCESSO);
        return true;
    }

    public double consultarSaldoEmConta() {
        return saldoConta;
    }
    public double consultarTotalDisponivel() {
        return this.saldoConta + (this.limiteChequeEspecial - this.usadoChequeEspecial);
    }
    public double consultarLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public double consultarChequeEspecialUsado() {
        return usadoChequeEspecial;
    }
    public static class Mensagens {
        public static final String DEPOSITO_SUCESSO = "[SUCESSO] Depósito realizado com sucesso.";
        public static final String DEPOSITO_INVALIDO = "[ERRO] Valor de depósito inválido.";
        public static final String TAXA_QUITADA = "[INFO] Sua taxa devida foi quitada com sucesso.";
        public static final String CHEQUE_QUITADO = "[INFO] Seu cheque especial foi quitado com sucesso.";
        public static final String SAQUE_REALIZADO = "[SUCESSO] Saque realizado com sucesso.";
        public static final String SEM_SALDO = "[INFO] Saldo insuficiente na conta.";
        public static final String PAG_BOLETO_REALIZADO = "[SUCESSO] Pagamento do boleto realizado com sucesso.";
        public static final String BOLETO_INVALIDO = "[ERRO] Valor do boleto é inválido.";
    }
}
