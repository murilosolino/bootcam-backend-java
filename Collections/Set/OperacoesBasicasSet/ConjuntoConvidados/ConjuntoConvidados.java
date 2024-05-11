package Collections.Set.OperacoesBasicasSet.ConjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        convidadosSet = new HashSet<>();
    }

    public void adicionaConjunto(String nome, int codigoConvite){
        convidadosSet.add(new Convidado(codigoConvite, nome));
    }

    public void removerConvidadoPorCodConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado convidado : convidadosSet) {

            if (convidado.getCodigoConvidado() == codigoConvite){
                convidadoParaRemover = convidado;
                break;
            }
        }

        convidadosSet.remove(convidadoParaRemover);

    }

    public int ContarConvidados(){
        return convidadosSet.size();
    }

    public void exibirConvidado(){
        System.out.println("convidadoSet:");
        for (Convidado convidado : convidadosSet) {
            System.out.println(convidado.toString());
        }
    }


    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
    
        // Adicionando convidados
        conjuntoConvidados.adicionaConjunto("Ana", 1);
        conjuntoConvidados.adicionaConjunto("Maria", 2);
        conjuntoConvidados.adicionaConjunto("Pedro", 3);
        conjuntoConvidados.adicionaConjunto("Ana", 4);
        conjuntoConvidados.adicionaConjunto("Carlos", 5);
    
        // Contando convidados
        int totalConvidados = conjuntoConvidados.ContarConvidados();
        System.out.println("Total de convidados: " + totalConvidados);
    
        // Exibindo convidados
        conjuntoConvidados.exibirConvidado();
    
        // Removendo convidado
        conjuntoConvidados.removerConvidadoPorCodConvite(3);
    
        // Contando convidados após remoção
        totalConvidados = conjuntoConvidados.ContarConvidados();
        System.out.println("Total de convidados após remoção: " + totalConvidados);
    
        // Exibindo convidados após remoção
        conjuntoConvidados.exibirConvidado();
    }

}
