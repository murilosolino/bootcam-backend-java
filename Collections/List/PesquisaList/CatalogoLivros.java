package Collections.List.PesquisaList;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class CatalogoLivros {
    
    private List<Livro> catalogo;

    public CatalogoLivros() {
        this.catalogo = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPubli){
        catalogo.add(new Livro(titulo, autor, anoPubli));
    }

    public List<Livro> pesquisarAutor(String autor){
        
        List<Livro> livrosPorAutor = new ArrayList<>();

        if (catalogo.isEmpty()) {
            throw new NoSuchElementException("Lista Vazia");
        }

        for (Livro livro : catalogo) {
            if (livro.getAutor().equalsIgnoreCase(autor)){
                livrosPorAutor.add(livro);
            }
        }

        return livrosPorAutor;
    }

    public List<Livro> pesquisarIntervaloDeAno(int anoInical, int anoFinal){
        
        List<Livro> livrosIntervaloDeAno = new ArrayList<>();

        if (catalogo.isEmpty()) {
            throw new NoSuchElementException("Lista Vazia");
        } else if (anoFinal < anoInical) {
            throw new IllegalArgumentException("Datas invalidas, anoInicial deve ser menor que anoFinal");
        }

        

        for (Livro livro : catalogo) {

            if ((livro.getAnoPubli() >= anoInical) && (livro.getAnoPubli() <= anoFinal)) {
                livrosIntervaloDeAno.add(livro);
            }
        }

        return livrosIntervaloDeAno;
    }


    public Livro pesquisaPorTitulo(String titulo){
        Livro livroencontardo = null ;

        if (catalogo.isEmpty()) {
            throw new NoSuchElementException("Lista Vazia");
        }


        for (Livro livro : catalogo) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)){
                 livroencontardo = livro;
                 break;
            }
        }

        return livroencontardo;

    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();
        
        catalogo.adicionarLivro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        catalogo.adicionarLivro("1984", "George Orwell", 1949);
        catalogo.adicionarLivro("Moby Dick", "Herman Melville", 1851);
        catalogo.adicionarLivro("Dom Quixote", "Miguel de Cervantes", 1605);
        catalogo.adicionarLivro("Guerra e Paz", "Leo Tolstoy", 1869);

        
        System.out.println(catalogo.pesquisarAutor("J.R.R. Tolkien"));

        System.out.println(catalogo.pesquisarIntervaloDeAno(1850, 1950));

        System.out.println(catalogo.pesquisaPorTitulo("1984"));
    }

}
