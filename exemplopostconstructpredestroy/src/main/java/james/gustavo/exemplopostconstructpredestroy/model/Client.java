package james.gustavo.exemplopostconstructpredestroy.model;

import lombok.*;
import org.springframework.stereotype.Component;

/**
 * @author Gustavo James
 * @version 1.0
 * @since 14/06/2020 - 22:21
 */
//lombok
@ToString
@Getter @Setter
@AllArgsConstructor

//springboot
@Component
public class Client {

    private String  name;
    private String lastName;

    public Client() {
        System.out.println("Classe cliente!");
    }
}
