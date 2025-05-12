package soap;

import jakarta.xml.ws.Endpoint;

public class Server {
    public static void main(String[] args) {
        ChatServiceImpl service = new ChatServiceImpl();
        String address = "http://localhost:8080/chat";
        Endpoint.publish(address, service);
        System.out.println("SOAP Server running at " + address);
    }
}