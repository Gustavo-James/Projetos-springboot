package james.gustavo.exemploinjecaodedependencia;

import james.gustavo.exemploinjecaodedependencia.model.Cat;
import james.gustavo.exemploinjecaodedependencia.model.Dog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Gustavo James
 * @version 1.0
 * @since 14/06/2020 - 21:49
 */
@SpringBootApplication
public class ExemploinjecaodedependenciaApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext  = SpringApplication.run(ExemploinjecaodedependenciaApplication.class, args);

		Pet pet = applicationContext.getBean(Pet.class);

//maneira acoplada
//		Pet pet = new Pet();
//		pet.execute();

//maneira menos acoplada
//		Pet pet = new Pet(new Cat());
//		pet.execute();
//
//		Pet pet1 = new Pet(new Dog());
//		pet1.execute();

	}

}
