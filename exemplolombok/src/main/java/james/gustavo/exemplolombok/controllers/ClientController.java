package james.gustavo.exemplolombok.controllers;

import james.gustavo.exemplolombok.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author Gustavo James
 * @version 1.0
 * @since 14/06/2020 - 21:17
 */
@RestController
public class ClientController {

    @GetMapping("/clients")
    public ArrayList<Client> getClients() {

        ArrayList<Client> clients = new ArrayList<>();

        Client client = new Client();
        client.setName("Gustavo");
        client.setLastName("James");
        client.setAge(19);

        Client client1 = new Client();
        client1.setName("Silva");
        client1.setLastName("James");
        client1.setAge(20);

        clients.add(client);
        clients.add(client1);

        return clients;
    }


}
