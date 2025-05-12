package soap;

import jakarta.xml.ws.Service;
import javax.xml.namespace.QName;
import java.net.URL;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            QName qname = new QName("http://localhost:8080/", "chat");
            Service service = Service.create(new URL("http://localhost:8080/chat?wsdl"), qname);
            ChatService chat = service.getPort(ChatService.class);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            while (true) {
                System.out.print("Enter message (or 'exit' to quit): ");
                String message = scanner.nextLine();
                if (message.equals("exit")) break;
                chat.sendMessage(username, message);
                System.out.println("Messages: " + chat.getMessages());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}