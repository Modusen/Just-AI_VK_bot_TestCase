package ru.JustAITestCase.Bot.model.message;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Message {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("date")
    private Integer date;
    @JsonProperty("peer_id")
    private Integer peerId;
    @JsonProperty("from_id")
    private Integer fromId;
    @JsonProperty("text")
    private String text;
    @JsonProperty("random_id")
    private Integer randomId;
    @JsonProperty("ref")
    private String ref;
    @JsonProperty("ref_source")
    private String refSource;
    @JsonProperty("important")
    private Boolean important;
    @JsonProperty("out")
    private Integer out;
    @JsonProperty("version")
    private Integer version;
    @JsonProperty("conversation_message_id")
    private Integer convMessageId;
    @JsonProperty("fwd_messages")
    private Message[] fwdMessages;
    @JsonProperty("is_hidden")
    private Boolean isHidden;
    @JsonProperty("is_unavailable")
    private Boolean isUnavailable;

    public Integer getPeerId() {
        return peerId;
    }

    public Integer getFromId() {
        return fromId;
    }

    public String getText() {
        return text;
    }
}
