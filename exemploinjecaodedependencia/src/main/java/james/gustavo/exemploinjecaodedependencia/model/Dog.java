package james.gustavo.exemploinjecaodedependencia.model;

import james.gustavo.exemploinjecaodedependencia.interfaces.AnimalInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Gustavo James
 * @version 1.0
 * @since 14/06/2020 - 21:43
 */
@Component
@Primary
@Qualifier("dog")
public class Dog implements AnimalInterface {

    @Override
    public void comunicate() {
        System.out.println("Au! Au!");
    }
}
