package Collections.List.ListaDeTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa{

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarfea(String descricao){
        tarefaList.add( new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        
        List<Tarefa> tarefaParaRemover = new ArrayList<>();

        for (Tarefa tarefa : tarefaList) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaRemover.add(tarefa);
            }
        }

        tarefaList.removeAll(tarefaParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){

        for (Tarefa tarefa : tarefaList) {
            System.out.println(tarefa.toString());
        }

    }

    public static void main(String[] args) {

        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("Tamanho da lista: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarfea("Acordar");
        listaTarefa.adicionarTarfea("Escovar os dentes");
        listaTarefa.adicionarTarfea("Arrumar a cama");
        listaTarefa.adicionarTarfea("Tomar Cafe");

        System.out.println("Tamanho da lista: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();

        System.out.println("Removendo tarefas..... \n");
        System.err.println("Lista atualilada: \n");
        listaTarefa.removerTarefa("Escovar os dentes");
        listaTarefa.removerTarefa("Arrumar a cama");

        listaTarefa.obterDescricoesTarefas();

        System.out.println("Tamanho da lista: " + listaTarefa.obterNumeroTotalTarefas());

        


    }

}
