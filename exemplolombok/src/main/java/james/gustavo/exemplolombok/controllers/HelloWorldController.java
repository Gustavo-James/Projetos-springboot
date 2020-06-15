package james.gustavo.exemplolombok.controllers;

import james.gustavo.exemplolombok.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gustavo James
 * @version 1.0
 * @since 14/06/2020 - 20:38
 */
@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Olá! Exemplo lombok";
    }

//    @GetMapping("/product")
//    public String getProduct() {
//        return "Objeto produto";
//    }


}
