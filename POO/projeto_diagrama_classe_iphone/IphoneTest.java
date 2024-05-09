package POO.projeto_diagrama_classe_iphone;

import POO.projeto_diagrama_classe_iphone.Navegador.Safari;
import POO.projeto_diagrama_classe_iphone.ReprodutorMusical.Ipod;
import POO.projeto_diagrama_classe_iphone.Telefone.Phone;
import POO.projeto_diagrama_classe_iphone.aparelho_multifuncional.Iphone;

public class IphoneTest {
    public static void main(String[] args) throws InterruptedException {
        
        Iphone iphone = new Iphone("Iphone 15 PRO", "Preto", "1TB");

        //operacoes nativas
        iphone.ligarIphone();
        iphone.travarTela();
        iphone.informacoes();

        System.out.println();

        //acessando a internet
        iphone.exibePagina("www.apple.com");
        iphone.adicionarAba();
        iphone.ataualizarPagina();

        System.out.println();

        //tocando musica
        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.selecionarMusica("Viva la vida - coldplay");

        System.out.println();

        //acoes telefonicas
        iphone.ligar(1199997777L);
        iphone.atender();
        iphone.inciarCorreioVoz();

        System.out.println();
        
        Ipod ipod = new Ipod();
        ipod.selecionarMusica("Superman = Eminem");

        System.out.println();

        Phone phone = new Phone();
        phone.ligar(4477778888L);

        System.out.println();

        Safari safari = new Safari();
        safari.exibePagina("www.youtube,com");


    }
}
