package com.chatroom;

import java.util.List;

public interface ChatService {
    void sendMessage(String username, String message);
    List<String> getMessages();
}
