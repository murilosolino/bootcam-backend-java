package POO.Enum;

// Criando o enum EstadoBrasileiro para ser usado em tosa a aplicação
public enum EstadoBrasileiro {
        SAO_PAULO("São Paulo", "SP"),
        RIO_DE_JANEIRO("Rio de Janeiro", "RJ"),
        MINAS_GERAIS("Minas Gerais", "MG"),
        PARANA("Paraná", "PR"),
        SANTA_CATARINA("Santa Catarina", "SC"),
        RIO_GRANDE_DO_SUL("Rio Grande do Sul", "RS"),
        BAHIA("Bahia", "BA");

        private String nome;
        private String sigla;

        EstadoBrasileiro(String nome, String sigla){
            this.nome = nome;
            this.sigla = sigla;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getSigla() {
            return sigla;
        }

        public void setSigla(String sigla) {
            this.sigla = sigla;
        }

        public String nomeMaisuculo(String nomeUF){
            return nomeUF.toUpperCase();
        }

}
