package POO.projeto_diagrama_classe_iphone.Telefone;

public class Phone implements AparelhoTelefonico {

    @Override
    public void ligar(long numero) {
        System.out.println("Ligando para " + numero + " via telefone");
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida");
    }

    @Override
    public void inciarCorreioVoz() {
       System.out.println("iniciando correio de voz");
    }

    
}
