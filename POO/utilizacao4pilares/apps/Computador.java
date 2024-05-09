package POO.utilizacao4pilares.apps;

import POO.utilizacao4pilares.FacebookMessenger;
import POO.utilizacao4pilares.MSN;
import POO.utilizacao4pilares.ServicoMensagemInstantanea;

public class Computador {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        String servico = "FacebookMessenger";

        if (servico.equals("MSN")) {
            smi = new MSN();
        } else if (servico.equals("FacebookMessenger")) {
            smi = new FacebookMessenger();
        } else {
            System.out.println("Serviço não encontrado");
        }

        
        smi.enviarMensagem();
        smi.RecebendoMensagem();

    }
}
