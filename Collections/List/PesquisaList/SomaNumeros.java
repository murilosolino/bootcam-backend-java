package Collections.List.PesquisaList;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    
    private List<Integer> listaNumerosInteiros;

    public SomaNumeros(){
        listaNumerosInteiros = new ArrayList<Integer>();
    }

    public void adicionarNumero(int numero){
        listaNumerosInteiros.add(numero);
    }

    public int calcularSoma(){
        int total = 0;
        for (Integer i : listaNumerosInteiros) {
            total += i;
        }
        return total;
    }

    public int encontrarMaiorNumero(){

        int maior = listaNumerosInteiros.get(0);

        for (Integer i : listaNumerosInteiros) {

            if (i > maior){ 
                maior = i;
            }
        }

        return maior;

    }

    public int encontrarMenorNumero(){

        int menor = listaNumerosInteiros.get(0);

        for (Integer i : listaNumerosInteiros) {

            if (i < menor){
                menor = i;
            }
        }

        return menor;

    }

    public void exibirNumeros(){

        for (Integer integer : listaNumerosInteiros) {
            
            System.out.println(integer);

        }
    }

    public static void main(String[] args) {
        
            SomaNumeros somaNumeros = new SomaNumeros();

            // Adicionando números à lista
            somaNumeros.adicionarNumero(30);
            somaNumeros.adicionarNumero(5);
            somaNumeros.adicionarNumero(30);
            somaNumeros.adicionarNumero(40);
            somaNumeros.adicionarNumero(50);

            // Encontrando o maior número
            int maior = somaNumeros.encontrarMaiorNumero();
            System.out.println("O maior número é: " + maior);

            // Encontrando o menor número
            int menor = somaNumeros.encontrarMenorNumero();
            System.out.println("O menor número é: " + menor);

            // Exibindo todos os números
            System.out.println("Os números são:");
            somaNumeros.exibirNumeros();
        
    }

}
