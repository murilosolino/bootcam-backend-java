package POO.utilizacao4pilares;
public class FacebookMessenger extends ServicoMensagemInstantanea{

    @Override
    public void enviarMensagem() {
        verificaConexao();
        System.out.println("Enviando mensagem pelo Facebook Messenger");
    }

    @Override
    public void RecebendoMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook Messenger");
    }
    
}
