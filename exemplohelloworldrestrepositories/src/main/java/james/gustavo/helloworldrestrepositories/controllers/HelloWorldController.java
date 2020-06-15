package james.gustavo.helloworldrestrepositories.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gustavo James
 * @version 1.0
 * @since 14/06/2020 - 19:08
 */
@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Olá! Hello World com rest repositories";
    }

}
