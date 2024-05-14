package Collections.Map.PesquisaMap;

public class Produto {
    
    private String nome;
    private int quantidade;
    private double valor;
    
    public Produto(String nome, int quantidade, double valor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", quantidade=" + quantidade + ", valor=" + valor + "]";
    }

    

}
