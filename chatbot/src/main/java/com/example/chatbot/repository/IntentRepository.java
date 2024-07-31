package com.example.chatbot.repository;

import com.example.chatbot.model.Intent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IntentRepository extends JpaRepository<Intent, Long> {}