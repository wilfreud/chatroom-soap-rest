package com.chatroom;

import java.util.ArrayList;
import java.util.HashMap;

public interface ChatService {
    void subscribe(String pseudo);
    void unsubscribe(String pseudo);
    void postMessage(String pseudo, String message);
    String[] getAllMessages();
    int getSize();
}
