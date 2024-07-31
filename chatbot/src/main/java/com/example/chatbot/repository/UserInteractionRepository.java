package com.example.chatbot.repository;

import com.example.chatbot.model.UserInteraction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInteractionRepository extends JpaRepository<UserInteraction, Long> {}
