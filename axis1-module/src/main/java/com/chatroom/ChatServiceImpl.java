package com.chatroom;

import java.util.ArrayList;
import java.util.HashMap;

public class ChatServiceImpl implements ChatService {
    private static final HashMap<String, String> users = new HashMap<>();
    private static final ArrayList<String> messages = new ArrayList<>();

    @Override
    public void subscribe(String pseudo) {
        users.put(pseudo, pseudo);
        messages.add(pseudo + " a rejoint le chat.");
    }

    @Override
    public void unsubscribe(String pseudo) {
        users.remove(pseudo);
        messages.add(pseudo + " a quitté le chat.");
    }

    @Override
    public void postMessage(String pseudo, String message) {
        messages.add(pseudo + ": " + message);
    }

    @Override
    public String[] getAllMessages() {
        return new String[0];
    }

    @Override
    public int getSize() {
        return users.size();
    }
}
