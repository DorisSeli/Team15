package com.datorium.Datorium.API.Controllers;

import com.datorium.Datorium.API.DTOs.Message;
import com.datorium.Datorium.API.Services.MessageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MessageController {

    private MessageService messageService;

    // Constructor initializes the MessageService manually
    public MessageController() {
        this.messageService = new MessageService();
    }

    // Test endpoint
    @PostMapping("/test")
    public String test() {
        return "Test successful!";
    }

    // Endpoint to add a message
    @PostMapping("/message")
    public String add(@RequestBody Message message) {
        return messageService.add(message);
    }
}