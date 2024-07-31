# Chatbot-for-Employee-Queries
This project is a Spring Boot application designed to serve as a chatbot for a startup company. The chatbot assists employees in finding answers to their queries regarding company policies, running APIs, and other related questions. The chatbot leverages data science techniques to learn and predict answers to new questions.

# Features
- Employee Management: Manage employee details including their name, department, and email.
- Intent Recognition: Identify the intent behind employee queries to provide accurate responses.
- Question and Answer Management: Store and manage a repository of questions and their corresponding answers.
- Training Data: Use training data to improve the chatbot's understanding and response accuracy.
- User Interaction Tracking: Track user interactions and gather feedback to continually improve the chatbot's performance.
- Context Management: Maintain context for ongoing conversations with employees.

# Technologies Used
- Java: Programming language for backend development.
- Spring Boot: Framework for building the backend application.
- Spring Data JPA: For database interactions.
- H2 Database: In-memory database for development and testing.
- Maven: Dependency management and build tool.

#Database Schema
The database schema includes the following entities and their relationships:

- Employees
  - id (PK)
  - name
  - department
  - email

- Intents
  - id (PK)
  - intent (Unique)
  - description

- Questions
  - id (PK)
  - intent_id (FK) references Intents(id)
  - question

- Answers
  - id (PK)
  - question_id (FK) references Questions(id)
  - answer

- Training Data
  - id (PK)
  - question
  - intent (FK) references Intents(intent)

- User Interactions
  - id (PK)
  - user_id (FK) references Employees(id)
  - question_id (FK) references Questions(id)
  - answer_id (FK) references Answers(id)
  - interaction_time (Default: current_timestamp)

- Feedback
  - id (PK)
  - interaction_id (FK) references User Interactions(id)
  - feedback_text
  - rating

- Context
  - id (PK)
  - user_id (FK) references Employees(id)
  - context_data
  - last_updated (Default: current_timestamp)

# Prerequisites
- Java 8 or higher
- Maven
- IDE (IntelliJ IDEA, Eclipse, etc.)

# Future Enhancements
- NLP Integration: Use Natural Language Processing models to better understand and predict answers.
- Machine Learning: Implement machine learning techniques to improve the chatbot's learning and response accuracy.
- Admin Interface: Create an admin interface for managing intents, questions, and answers.
- Security: Implement authentication and authorization for different user roles.

# Contributing
- Contributions are welcome! Please fork the repository and create a pull request with your changes.

# Contact
- For any inquiries or feedback, please contact roshanmurkar1998@gmail.com.
