package ru.JustAITestCase.Bot.controller;

import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.JustAITestCase.Bot.model.notification.Notification;
import ru.JustAITestCase.Bot.service.MessageServiceImpl;

@RestController
@RequestMapping("/event")
@Setter
@RequiredArgsConstructor
public class EventRecieverController {

    @Value("${vk_confirmation_code}")
    private String confirmationCode;

    private final MessageServiceImpl messageService;

    @GetMapping("/ping")
    public String ping() {
        System.out.println(confirmationCode);
        System.out.println("we're here");
        return "pong";
    }

    @PostMapping("")
    public ResponseEntity<String> event (@RequestBody Notification notification) {
        if (notification.getType().equals("confirmation")) {
            return new ResponseEntity<>(confirmationCode, HttpStatusCode.valueOf(200));
        } else if (notification.getType().equals("message_new")) {
            messageService.sendMessageInResponse(notification.getMessageNew().getMessage());
            return new ResponseEntity<>("ok", HttpStatusCode.valueOf(200));
        } else {
            return new ResponseEntity<>("oops", HttpStatusCode.valueOf(200));
        }
    }
}
