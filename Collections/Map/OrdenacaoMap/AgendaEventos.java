package Collections.Map.OrdenacaoMap;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    
    private Map<LocalDate, Evento> agendaEventosMap;

    public AgendaEventos() {
        this.agendaEventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        agendaEventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirEventosOrdenados(){
        Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(agendaEventosMap);
        System.out.println(eventosOrdenados.toString());
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate dataProximoEvento = null;
        Evento proximoEvento = null;

        for(LocalDate data : agendaEventosMap.keySet()){
            if(data.isAfter(dataAtual)){
                dataProximoEvento = data;
                proximoEvento = agendaEventosMap.get(data);
                break;
            }
        }

        if(proximoEvento == null){
            System.out.println("Não há eventos futuros");
        }else{
            System.out.println("Próximo evento: " + proximoEvento.toString());
        }

        System.out.println("Proxima data de evento: " + dataProximoEvento);

    }

        public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
    
        // Adicionando eventos
        agendaEventos.adicionarEvento(LocalDate.of(2024, 12, 25), "Natal", "Papai Noel");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 1, 1), "Ano Novo", "Fogos de Artifício");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 2, 14), "Dia dos Namorados", "Jantar Romântico");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 4, 21), "Páscoa", "Coelho da Páscoa");
    
        // Exibindo eventos ordenados
        agendaEventos.exibirEventosOrdenados();
    
        // Obtendo o próximo evento
        agendaEventos.obterProximoEvento();
        }
    

}
