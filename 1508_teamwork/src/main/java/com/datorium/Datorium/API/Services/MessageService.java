package com.datorium.Datorium.API.Services;

import com.datorium.Datorium.API.DTOs.Message;

public class MessageService {
    public String add(Message message) {
        return "Hello, you sent a message: " + message.getText();
    }
}
