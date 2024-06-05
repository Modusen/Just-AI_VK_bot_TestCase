package ru.JustAITestCase.Bot.model.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import ru.JustAITestCase.Bot.model.client.ClientInfo;
@Data
public class MessageNew {
    @JsonProperty("message")
    private Message message;
    @JsonProperty("client_info")
    private ClientInfo clientInfo;

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public ClientInfo getClientInfo() {
        return clientInfo;
    }

    public void setClientInfo(ClientInfo clientInfo) {
        this.clientInfo = clientInfo;
    }
}
