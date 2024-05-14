package Collections.Map.OperacoesBasicasMap;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class AgendaContatos {
    
    private Map<String,Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    } 


    public void adiconarContato(String nome, Integer numero){
        agendaContatoMap.put(nome, numero);
    }

    public void removerContato(String nome){

        if(agendaContatoMap.isEmpty()){
            throw new NoSuchElementException();
        }

        agendaContatoMap.remove(nome);
    }

    public void exibirConatato(){
        System.out.println(agendaContatoMap.toString());
    }

    public Integer pesquisarPorNome(String nome){
        if(agendaContatoMap.isEmpty()){
            throw new NoSuchElementException();
        }

        return agendaContatoMap.get(nome);
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
    
        // Adicionando contatos
        agendaContatos.adiconarContato("João", 123456789);
        agendaContatos.adiconarContato("Maria", 987654321);
        agendaContatos.adiconarContato("Pedro", 456789123);
        agendaContatos.adiconarContato("Ana", 321987654);
        agendaContatos.adiconarContato("Carlos", 789123456);
        
    
        // Exibindo contatos
        agendaContatos.exibirConatato();
    
        // Pesquisando por nome
        Integer numeroJoao = agendaContatos.pesquisarPorNome("João");
        System.out.println("Número do João: " + numeroJoao);
    
        // Removendo contato
        agendaContatos.removerContato("João");
    
        // Exibindo contatos após remoção
        agendaContatos.exibirConatato();
    }

}
