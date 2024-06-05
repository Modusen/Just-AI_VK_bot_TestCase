package ru.JustAITestCase.Bot.model.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClientInfo {
    @JsonProperty("button_actions")
    private String[] buttonActions;
    @JsonProperty("keyboard")
    private Boolean isKeyboard;
    @JsonProperty("inline_keyboard")
    private Boolean isInlineKeyboard;
    @JsonProperty("carousel")
    private Boolean carousel;
    @JsonProperty("lang_id")
    private Integer langId;

}
