package james.gustavo.exemploinjecaodedependencia.model;

import james.gustavo.exemploinjecaodedependencia.interfaces.AnimalInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Gustavo James
 * @version 1.0
 * @since 14/06/2020 - 21:45
 */
@Component
@Qualifier("cat")
public class Cat implements AnimalInterface {

    @Override
    public void comunicate() {
        System.out.println("Miau! Miau!");
    }
}
