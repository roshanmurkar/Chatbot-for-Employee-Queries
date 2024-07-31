
package com.example.chatbot.controller;

import com.example.chatbot.model.*;
import com.example.chatbot.service.ChatbotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chatbot")
public class ChatbotController {
    @Autowired
    private ChatbotService chatbotService;

    @GetMapping("/question")
    public String askQuestion(@RequestParam Long employeeId, @RequestParam String question) {
        String answer = chatbotService.getAnswer(question);
        return answer;
    }

    @PostMapping("/question")
    public Question saveQuestion(@RequestBody Question question) {
        return chatbotService.saveQuestion(question);
    }

    @PostMapping("/answer")
    public Answer saveAnswer(@RequestBody Answer answer) {
        return chatbotService.saveAnswer(answer);
    }
}
