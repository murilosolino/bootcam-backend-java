package Collections.Set.OrdenacaoSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    
    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long codigo, double valor, int quantidade){
           produtoSet.add(new Produto(nome, codigo, valor, quantidade));
    }

    public Set<Produto> exibirProdutoPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());

        produtoPorPreco.addAll(produtoSet);

        return produtoPorPreco;
    }
    
    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
    
        // Adicionando produtos
        cadastroProduto.adicionarProduto("Produto 1", 1001, 10.50, 5);
        cadastroProduto.adicionarProduto("Produto 2", 1002, 20.00, 3);
        cadastroProduto.adicionarProduto("Produto 3", 1003, 15.75, 7);
        cadastroProduto.adicionarProduto("Produto 4", 1004, 8.99, 10);
        cadastroProduto.adicionarProduto("Produto 5", 1005, 25.30, 2);
    
        // Exibindo produtos por nome
        
        System.out.println("Produtos ordenados por nome: " + cadastroProduto.exibirProdutoPorNome());
    
        // Exibindo produtos por preço
       
        System.out.println("Produtos ordenados por preço: " + cadastroProduto.exibirPorPreco());
    }

}
