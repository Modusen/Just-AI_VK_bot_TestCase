package ru.JustAITestCase.Bot.service;

import org.apache.http.client.utils.URIBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.JustAITestCase.Bot.model.message.Message;

import java.net.URI;
import java.net.URISyntaxException;

@Service
public class MessageServiceImpl implements MessageService {
    private final Logger logger = LoggerFactory.getLogger(MessageServiceImpl.class);
    private final RestTemplate restTemplate = new RestTemplate();
    @Value("${vk_bot_token}")
    private String token;
    @Value("${callback_API_version}")
    private String version;

    public void sendMessageInResponse(Message message) {
        String url = "https://api.vk.com/method/messages.send?";

        try {
            URI uri = new URIBuilder(url)
                    .addParameter("message", "Вы сказали: " + message.getText())
                    .addParameter("peer_id", String.valueOf(message.getPeerId()))
                    .addParameter("access_token", token)
                    .addParameter("v", version)
                    .addParameter("random_id", "0")
                    .build();
            ResponseEntity<?> response = restTemplate.postForEntity(uri, null, String.class);

            if (response.getStatusCode() == HttpStatusCode.valueOf(200)) {
                logger.info("Response body: \r\n" + response.getBody());
            }

        } catch (URISyntaxException e) {
            logger.error("Ошибка создания URI");
            e.printStackTrace();
        }
    }
}
