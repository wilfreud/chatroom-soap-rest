package soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import java.util.List;

@WebService
public interface ChatService {
    @WebMethod
    void sendMessage(String username, String message);
    @WebMethod
    List<String> getMessages();
}