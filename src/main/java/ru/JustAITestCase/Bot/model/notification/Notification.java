package ru.JustAITestCase.Bot.model.notification;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.JustAITestCase.Bot.model.message.MessageNew;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Notification {
    private String type;
    private String event_id;
    private String v;

    @JsonProperty("object")
    private MessageNew messageNew;
    private String group_id;

    public String getEvent_id() {
        return event_id;
    }

    public void setEvent_id(String event_id) {
        this.event_id = event_id;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    public MessageNew getMessageNew() {
        return messageNew;
    }

    public void setMessageNew(MessageNew messageNew) {
        this.messageNew = messageNew;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }
}
