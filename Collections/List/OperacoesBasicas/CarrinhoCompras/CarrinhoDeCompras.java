package Collections.List.OperacoesBasicas.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class CarrinhoDeCompras {
    
    private List<Item> carrinho;

    public CarrinhoDeCompras(){
    this.carrinho = new ArrayList<>();
    }
    
    public void adicionarItem(String nome, double valor, int qtd){
        Item item =  new Item(nome, valor, qtd);
        carrinho.add(item);
    }

    public void removerItem(String nomeItem) throws Exception{
 
        if (carrinho.size() == 0){
            throw new NoSuchElementException("Não é possível remover um item de uma lista vazia");
        }

        for (Item i : carrinho) {
            
            if (i.getNome().equalsIgnoreCase(nomeItem)){
                carrinho.remove(i);
            }

        }
    }

    public double calcularValorTotal(){
        double total = 0;

        for (Item item : carrinho) {
            total += item.getPreco() * item.getQtd();
        }

        return total;
        
    }

    public void exibirItens(){

        for (Item item : carrinho) {
            System.out.println(item.toString());
        }
    }

    public static void main(String[] args) throws Exception {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();


        carrinhoDeCompras.adicionarItem("Caixa de Leite", 5.00, 2);
        carrinhoDeCompras.adicionarItem("remedio", 20, 1);
        carrinhoDeCompras.adicionarItem("Saco de arroz", 7, 1);

        System.out.println();

        carrinhoDeCompras.exibirItens();

        System.out.println();

        System.out.println("Valor total do carrinho: " + carrinhoDeCompras.calcularValorTotal());

        System.out.println();

        carrinhoDeCompras.removerItem("remedio");
        carrinhoDeCompras.exibirItens();
        System.out.println("Valor total do carrinho: " + carrinhoDeCompras.calcularValorTotal());

        
    }

}
