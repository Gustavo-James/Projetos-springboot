package james.gustavo.exemplopostconstructpredestroy;

import james.gustavo.exemplopostconstructpredestroy.dao.ClientDAO;
import james.gustavo.exemplopostconstructpredestroy.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExemplopostconstructpredestroyApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ExemplopostconstructpredestroyApplication.class, args);

		ClientDAO clientDAO = applicationContext.getBean(ClientDAO.class);
		clientDAO.setClient(new Client( "Gustavo", "James"));

		System.out.println("ClienteDAO: " + clientDAO);
		System.out.println("Client" + clientDAO.getClient().toString());


	}

}
