package com.example.chatbot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class UserInteraction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Employee employee;
    @ManyToOne
    private Question question;
    @ManyToOne
    private Answer answer;
    private LocalDateTime interactionTime;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	public LocalDateTime getInteractionTime() {
		return interactionTime;
	}
	public void setInteractionTime(LocalDateTime interactionTime) {
		this.interactionTime = interactionTime;
	}

    // Getters and Setters
    
}