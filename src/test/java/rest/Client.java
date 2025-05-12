package rest;

import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
// import jakarta.ws.rs.core;
import jakarta.ws.rs.core.MediaType;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        jakarta.ws.rs.client.Client client = ClientBuilder.newClient();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        while (true) {
            System.out.print("Enter message (or 'exit' to quit): ");
            String message = scanner.nextLine();
            if (message.equals("exit")) break;

            client.target("http://localhost:8081/chat/send")
                    .request()
                    .post(Entity.form(new jakarta.ws.rs.core.Form()
                            .param("username", username)
                            .param("message", message)));

            List<String> messages = client.target("http://localhost:8081/chat/messages")
                    .request(MediaType.APPLICATION_JSON)
                    .get(List.class);
            System.out.println("Messages: " + messages);
        }
        client.close();
    }
}