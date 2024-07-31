package com.example.chatbot.repository;

import com.example.chatbot.model.TrainingData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainingDataRepository extends JpaRepository<TrainingData, Long> {}
