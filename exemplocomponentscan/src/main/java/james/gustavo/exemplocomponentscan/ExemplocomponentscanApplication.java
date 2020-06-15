package james.gustavo.exemplocomponentscan;

import dao.ClassDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan("dao")
public class ExemplocomponentscanApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ExemplocomponentscanApplication.class, args);

		ClassDAO objectDAO = applicationContext.getBean(ClassDAO.class);

		System.out.println("ClasseDAO: " + objectDAO);
		System.out.println("ObjectJDBC dentro do objectDAO: " + objectDAO.getClassJDBC());

	}

}
