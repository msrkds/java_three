package ru.geekbrains.java_three.lesson_2.server;

public interface AuthService {
    void start();

    void stop();

    String getNickByLoginAndPass(String login, String password);
}
