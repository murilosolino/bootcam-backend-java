package gof.Facede;

import gof.Facede.subsistema1crm.CrmService;
import gof.Facede.subsistema2cep.CepApi;

public class Facede {
    
    public void migrarCliente(String nome, String cep){

        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarUf(cep);

        CrmService.gravarCliente(nome,cep,cidade,estado);
    }
}
