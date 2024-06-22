package dio.dio_spring_security.Controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    
    @GetMapping
    public String welcome(){
        return "Bem vindo a minha aplicacao Spring Boot Web API";
    }

}
