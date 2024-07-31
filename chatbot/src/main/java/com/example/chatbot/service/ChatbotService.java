// ChatbotService.java
package com.example.chatbot.service;

import com.example.chatbot.model.*;
import com.example.chatbot.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ChatbotService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private IntentRepository intentRepository;
    @Autowired
    private QuestionRepository questionRepository;
    @Autowired
    private AnswerRepository answerRepository;
    @Autowired
    private TrainingDataRepository trainingDataRepository;
    @Autowired
    private UserInteractionRepository userInteractionRepository;
    @Autowired
    private FeedbackRepository feedbackRepository;
    @Autowired
    private ContextRepository contextRepository;

    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    public String getAnswer(String question) {
        // Implement simple logic to get answer from the knowledge base
        return questionRepository.findAll()
            .stream()
            .filter(q -> q.getQuestion().equalsIgnoreCase(question))
            .map(q -> q.getAnswers().stream().findFirst().map(Answer::getAnswer).orElse("Answer not found."))
            .findFirst()
            .orElse("Answer not found.");
    }

    public Question saveQuestion(Question question) {
        return questionRepository.save(question);
    }

    public Answer saveAnswer(Answer answer) {
        return answerRepository.save(answer);
    }
}
