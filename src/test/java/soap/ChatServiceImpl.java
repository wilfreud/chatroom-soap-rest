package soap;

import jakarta.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "dev.commodore64.ChatService")
public class ChatServiceImpl implements ChatService {
    private final List<String> messages = new ArrayList<>();

    @Override
    public void sendMessage(String username, String message) {
        messages.add(username + ": " + message);
    }

    @Override
    public List<String> getMessages() {
        return new ArrayList<>(messages);
    }
}