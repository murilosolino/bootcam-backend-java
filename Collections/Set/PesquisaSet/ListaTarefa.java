package Collections.Set.PesquisaSet;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {
    
    private Set<Tarefa> listaTarefa;

    public ListaTarefa(){
        this.listaTarefa = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefa.add(new Tarefa(descricao, false));
    }

    public Tarefa removerTarefa(String descricao){
        Tarefa tarefaExcluida = null;

        for (Tarefa tarefa : listaTarefa) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefaExcluida = tarefa;
                break;
            }
        }

        listaTarefa.remove(tarefaExcluida);
        return tarefaExcluida;

    }

    public void exibirTarefa(){
        System.out.println(listaTarefa.toString());
    }

    public int contarTarefa(){
        return listaTarefa.size();
    }

    @Override
    public String toString() {
        return "ListaTarefa [listaTarefa=" + listaTarefa + "]";
    }

    public String obterTarefasConcluidas(){

         Set<Tarefa> concluida = new HashSet<>(); 
        
        for (Tarefa tarefa : listaTarefa) {
            
            if(tarefa.isConcluida()){
                concluida.add(tarefa);
            }

        }

        return concluida.toString();
        
    }

    public String obterTarefasPendentes(){

        Set<Tarefa> pendente = new HashSet<>(); 
       
       for (Tarefa tarefa : listaTarefa) {
           
           if(!tarefa.isConcluida()){
               pendente.add(tarefa);
           }

       }

       return pendente.toString();
       
   }

   public Tarefa marcarTarefaConcluida(String descricao){

        Tarefa tarefaConcluida = null;

        for (Tarefa tarefa : listaTarefa) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setConcluida(true);
                tarefaConcluida = tarefa;
                break;
            }
        }

        return tarefaConcluida;

   }

   public Tarefa marcarTarefaPendente(String descricao){

    Tarefa tarefaConcluida = null;

    for (Tarefa tarefa : listaTarefa) {
        if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
            tarefa.setConcluida(false);
            tarefaConcluida = tarefa;
            break;
        }
    }

    return tarefaConcluida;

}

    public void limparListaTarefas(){
        listaTarefa.removeAll(listaTarefa);
    }


    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
    
        // Adicionando tarefas
        listaTarefa.adicionarTarefa("Comprar leite");
        listaTarefa.adicionarTarefa("Estudar para a prova");
        listaTarefa.adicionarTarefa("Pagar contas");
        listaTarefa.adicionarTarefa("Ir à academia");
        listaTarefa.adicionarTarefa("Marcar consulta médica");
    
        listaTarefa.exibirTarefa();
        System.out.println("Quantidade de Tarefas: " + listaTarefa.contarTarefa());

        System.out.println();

        // Marcando tarefa como concluída
        listaTarefa.marcarTarefaConcluida("Comprar leite");
    
        // Marcando tarefa como pendente
        listaTarefa.marcarTarefaPendente("Estudar para a prova");
    
        // Exibindo tarefas pendentes
        
        System.out.println("Tarefas pendentes: " + listaTarefa.obterTarefasPendentes());
        System.out.println("Tarefas pendentes: " + listaTarefa.obterTarefasConcluidas());

        
    
        // Limpando lista de tarefas
        listaTarefa.limparListaTarefas();
    }
}
