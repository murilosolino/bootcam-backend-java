package POO.projeto_diagrama_classe_iphone.ReprodutorMusical;

public class Ipod implements ReprodutorMusical {

    @Override
    public void tocarMusica() {
       System.out.println("Incializando Musica");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Musica pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
       System.out.println("Musica selecionada: " + musica + " no Ipod");
    }
    
    
}
