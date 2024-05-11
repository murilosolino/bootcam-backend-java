package Collections.Set.OperacoesBasicasSet.ConjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas(){
        this.palavrasUnicas = new HashSet<>();
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas [palavrasUnicas=" + palavrasUnicas + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((palavrasUnicas == null) ? 0 : palavrasUnicas.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ConjuntoPalavrasUnicas other = (ConjuntoPalavrasUnicas) obj;
        if (palavrasUnicas == null) {
            if (other.palavrasUnicas != null)
                return false;
        } else if (!palavrasUnicas.equals(other.palavrasUnicas))
            return false;
        return true;
    }


    public void adicionarPalavra(String palavra){
        palavrasUnicas.add(palavra);
    }

    public String removerPalavra(String palavra){

        String palavraRemovida = null;

        for (String s : palavrasUnicas) {
            if (s.equalsIgnoreCase(palavra)) {
                palavraRemovida = palavra;
                break;
            }
        }

        palavrasUnicas.remove(palavraRemovida);
        return palavraRemovida;
    }
    
    public void verificarPalavra(String palavra){
        boolean palavraEncontarda = false;

        for (String s : palavrasUnicas) {
            if (s.equalsIgnoreCase(palavra)) {
                palavraEncontarda = true;
                break;
            }
        }

        if (palavraEncontarda) {
            System.out.println("Palavar presente no hash set: " + palavra);
        } else {
            System.out.printf("Palavra (%s) nao esta presente no HashSet. %n", palavra);
        }
    }

    public void exibirPalavras(){
        System.out.println(palavrasUnicas.toString());
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
    
        // Adicionando palavras
        conjuntoPalavrasUnicas.adicionarPalavra("Casa");
        conjuntoPalavrasUnicas.adicionarPalavra("Carro");
        conjuntoPalavrasUnicas.adicionarPalavra("Avião");
        conjuntoPalavrasUnicas.adicionarPalavra("Barco");
        conjuntoPalavrasUnicas.adicionarPalavra("Trem");
    
        // Exibindo palavras
        conjuntoPalavrasUnicas.exibirPalavras();
    
        // Verificando palavra
        conjuntoPalavrasUnicas.verificarPalavra("Carro");
    
        // Removendo palavra
        System.out.println("Palavra removida: " + conjuntoPalavrasUnicas.removerPalavra("Carro"));
    
        // Verificando palavra após remoção
        conjuntoPalavrasUnicas.verificarPalavra("Carro");
    
        // Exibindo palavras após remoção
        conjuntoPalavrasUnicas.exibirPalavras();
    }

}
