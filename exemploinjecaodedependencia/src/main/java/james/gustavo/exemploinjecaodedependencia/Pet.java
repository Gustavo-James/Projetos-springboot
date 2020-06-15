package james.gustavo.exemploinjecaodedependencia;

import james.gustavo.exemploinjecaodedependencia.interfaces.AnimalInterface;
import james.gustavo.exemploinjecaodedependencia.model.Cat;
import james.gustavo.exemploinjecaodedependencia.model.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Gustavo James
 * @version 1.0
 * @since 14/06/2020 - 21:46
 */
@Component
public class Pet {

    @Autowired
    @Qualifier("cat")
    private AnimalInterface animalInterface;

//    /**
//     *
//     * @param animalInterface
//     */
//    public Pet(AnimalInterface animalInterface) {
//        this.animalInterface = animalInterface;
//    }

    public void execute() {
        animalInterface.comunicate();
    }

//maneira acoplada
//    public void execute() {
//        animalInterface = new Dog();
//        animalInterface.comunicate();
//    }
}
