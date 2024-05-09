package POO.projeto_diagrama_classe_iphone.aparelho_multifuncional;

import POO.projeto_diagrama_classe_iphone.Navegador.NavegadorInternet;
import POO.projeto_diagrama_classe_iphone.ReprodutorMusical.ReprodutorMusical;
import POO.projeto_diagrama_classe_iphone.Telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    private String modelo;
    private String cor;
    private String armazenamento;

    public Iphone (){

    }

    public Iphone(String modelo, String cor, String armazenamento){
        this.modelo= modelo;
        this.cor = cor;
        this.armazenamento= armazenamento;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public void ligarIphone() throws InterruptedException{
        System.out.println("Ligando o Iphone...");
        Thread.sleep(3000);
        System.out.println("Iphone Ligou");
    }

    public void travarTela(){
        System.out.println("Tela Bloqueada");
    }

    public void informacoes(){
        System.out.println("Informacoes do Iphone: ");
        System.out.println("Modelo: " + this.modelo + " Aramazenamento: " + this.armazenamento + 
        " Cor: " + this.cor);
    }

    @Override
    public void exibePagina(String url) {
       System.out.println("Acessando " + url);
    }

    @Override
    public void adicionarAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void ataualizarPagina() {
       System.out.println("Pagina Atualizada");
    }

    @Override
    public void ligar(long numero) {
        System.out.println("Ligando para " + numero + " atraves do "  + this.modelo);
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida no " + this.modelo);
    }

    @Override
    public void inciarCorreioVoz() {
       System.out.println("iniciando correio de voz no " + this.modelo );
    }

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
       System.out.println("Musica selecionada: " + musica);
    }
    


}
