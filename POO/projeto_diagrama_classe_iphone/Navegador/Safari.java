package POO.projeto_diagrama_classe_iphone.Navegador;

public class Safari implements NavegadorInternet{

    @Override
    public void exibePagina(String url) {
       System.out.println("Acessando " + url + " via Safari");
    }

    @Override
    public void adicionarAba() {
        System.out.println("Nova aba adicionada no Safari");
    }

    @Override
    public void ataualizarPagina() {
       System.out.println("Pagina Atualizada no Safari");
    }
    
}
