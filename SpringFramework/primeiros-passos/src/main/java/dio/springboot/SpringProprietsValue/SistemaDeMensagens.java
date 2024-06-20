package dio.springboot.SpringProprietsValue;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaDeMensagens implements CommandLineRunner {

    @Value("${nome: null}") // recupera as informacoes setadas no resource/application.properties
    private String nomeEnvio;
    @Value("${email}") //recupera as informacoes setadas no resource/application.properties
    private String email;
    @Value("${telefones}") // recupera as informacoes setadas no resource/application.properties
    private List<Long> telefones;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: " + nomeEnvio
				+ "\nE-mail:" + email
				+ "\nCom telefones para contato: " + telefones);
		System.out.println("Seu cadastro foi aprovado");
    }
    
}
