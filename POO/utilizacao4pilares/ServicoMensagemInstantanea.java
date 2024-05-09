package POO.utilizacao4pilares;
public abstract class ServicoMensagemInstantanea {
        public abstract void enviarMensagem();
        public abstract void RecebendoMensagem();

        protected void verificaConexao() {
            System.out.println("Verificando conexão com a internet");
        }

}
