package ru.JustAITestCase.Bot.service;

import ru.JustAITestCase.Bot.model.message.Message;

public interface MessageService {
    void sendMessageInResponse(Message message);
}
