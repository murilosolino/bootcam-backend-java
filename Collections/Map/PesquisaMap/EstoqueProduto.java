package Collections.Map.PesquisaMap;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class EstoqueProduto {
    
    private Map<Long, Produto> estoqueMap;

    public EstoqueProduto() {
        this.estoqueMap = new HashMap<>();
    }

    public void adicionaProduto(long cod, String nome, int quantidade, double valor ){
        estoqueMap.put(cod, new Produto(nome, quantidade, valor));
    }

    public void exibirProdutos(){
        System.out.println(estoqueMap.toString());
    }

    public double calcularValorTotalEstoque(){
        

        double valorTotalEstoque = 0.0;

        for(Produto p : estoqueMap.values()){
            valorTotalEstoque += p.getQuantidade() * p.getValor();
        }

        return valorTotalEstoque;
    }

    // leva em consideracao produtos com valores diferentes
    public Produto obteProdutoMaisCaro(){

        if (estoqueMap.isEmpty()) {
            throw new NoSuchElementException();
        }

        Produto produtoMaisCaro = null;
        double maiorValor = Double.MIN_VALUE;

        for(Produto p : estoqueMap.values()){
            if(p.getValor() > maiorValor){
                produtoMaisCaro = p;
            }
        }

        return produtoMaisCaro;
    }

    public Produto obteProdutoMaisBarato(){

        if (estoqueMap.isEmpty()) {
            throw new NoSuchElementException();
        }

        Produto produtoMaisBarato = null;
        double menorValor = Double.MAX_VALUE;

        for(Produto p : estoqueMap.values()){
            if(p.getValor() < menorValor){
                produtoMaisBarato = p;
                menorValor = p.getValor();
            }
        }

        return produtoMaisBarato;
    }

    public static void main(String[] args) {
        EstoqueProduto estoqueProduto = new EstoqueProduto();
    
        // Adicionando produtos
        estoqueProduto.adicionaProduto(1001L, "Produto 1", 5, 10.50);
        estoqueProduto.adicionaProduto(1002L, "Produto 2", 3, 20.00);
        estoqueProduto.adicionaProduto(1003L, "Produto 3", 7, 15.75);
        estoqueProduto.adicionaProduto(1004L, "Produto 4", 10, 8.99);
        estoqueProduto.adicionaProduto(1005L, "Produto 5", 2, 25.30);
    
        // Calculando valor total do estoque
        double valorTotalEstoque = estoqueProduto.calcularValorTotalEstoque();
        System.out.println("Valor total do estoque: " + valorTotalEstoque);
    
        // Obtendo produto mais caro
        Produto produtoMaisCaro = estoqueProduto.obteProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro.getNome());
    
        // Obtendo produto mais barato
        Produto produtoMaisBarato = estoqueProduto.obteProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato.getNome());
    }

}
