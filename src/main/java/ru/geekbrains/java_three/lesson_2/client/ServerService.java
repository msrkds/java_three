package ru.geekbrains.java_three.lesson_2.client;

import ru.geekbrains.java_three.lesson_2.server.Message;

import java.io.IOException;

public interface ServerService {

    boolean isConnected();

    void openConnection();

    void closeConnection();

    String authorization(String login, String password) throws IOException;

    void sendMessage(String message);

    Message readMessages();

}
