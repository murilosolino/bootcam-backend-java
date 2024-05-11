package Collections.List.OrdenacaoList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    
    private List<Pessoa> listPessoa;

    public OrdenacaoPessoas(){
        listPessoa = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listPessoa.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listPessoa);
        Collections.sort(pessoasPorIdade);

        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listPessoa);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());

        return pessoasPorAltura;
    }
    
public static void main(String[] args) {
    OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

    // Adicionando pessoas
    ordenacaoPessoas.adicionarPessoa("João", 25, 1.75);
    ordenacaoPessoas.adicionarPessoa("Maria", 30, 1.65);
    ordenacaoPessoas.adicionarPessoa("Pedro", 20, 1.80);
    ordenacaoPessoas.adicionarPessoa("Ana", 35, 1.60);
    ordenacaoPessoas.adicionarPessoa("Carlos", 40, 1.70);

    // Ordenando pessoas por idade
    System.out.println("Pessoas ordenadas por idade: " + ordenacaoPessoas.ordenarPorIdade());

    System.out.println();

    // Ordenando pessoas por altura
    System.out.println("Pessoas ordenadas por altura: " + ordenacaoPessoas.ordenarPorAltura());
}

}
