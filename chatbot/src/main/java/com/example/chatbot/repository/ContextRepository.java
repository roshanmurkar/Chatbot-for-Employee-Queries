package com.example.chatbot.repository;

import com.example.chatbot.model.Context;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContextRepository extends JpaRepository<Context, Long> {}