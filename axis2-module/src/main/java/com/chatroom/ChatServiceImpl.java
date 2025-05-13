package com.chatroom;

import java.util.ArrayList;
import java.util.List;

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
