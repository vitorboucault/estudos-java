public class Enum {
    // Criando o enum EstadoBrasileiro para ser usado em toda a aplicação.
    public enum EstadoBrasileiro {
        SAO_PAULO ("SP","São Paulo", 11),
        RIO_JANEIRO ("RJ", "Rio de Janeiro", 12),
        PIAUI ("PI", "Piauí", 13),
        MARANHAO ("MA","Maranhão",13),
        CEARA("CE","Ceará",14),;

        private final String nome;
        private final String sigla;
        private int ibge;

        private EstadoBrasileiro(String sigla, String nome, int ibge) {
            this.ibge = ibge;
            this.sigla = sigla;
            this.nome = nome;
        }
        public String getSigla() {
            return sigla;
        }
        public String getNome() {
            return nome;
        }
        public String getNomeMaiusculo() {
            return nome.toUpperCase();
        }
        public int getIbge() {
            return ibge;
        }

    }

}
