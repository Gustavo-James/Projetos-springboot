package james.gustavo.exemplopostconstructpredestroy.dao;

import james.gustavo.exemplopostconstructpredestroy.model.Client;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Gustavo James
 * @version 1.0
 * @since 14/06/2020 - 22:25
 */
//lombok
@Getter @Setter

//springboot
@Component
public class ClientDAO {

    @Autowired
    private Client client;

    @PostConstruct
    public void postConstruct() {
        System.out.println("O objeto foi criado!");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("O objeto foi finalizado!");
    }
}
