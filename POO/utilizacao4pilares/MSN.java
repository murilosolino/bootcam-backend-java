package POO.utilizacao4pilares;
public class MSN extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        verificaConexao();
       System.out.println("Enviando mensagem pelo MSN");
    }

    @Override
    public void RecebendoMensagem() {
        System.out.println("Recebendo mensagem pelo MSN");
    }
    
}
