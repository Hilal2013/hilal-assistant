package com.hilal.assistant.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hilal.assistant.dto.ChatRequest;
import com.hilal.assistant.dto.ChatResponse;
import com.hilal.assistant.service.ChatService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/chat")
@CrossOrigin
public class ChatController {
private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

@PostMapping
public ChatResponse chat(@Valid @RequestBody ChatRequest request){

String reply=chatService.reply(request.getMessage());
return new ChatResponse(reply);
}


}
