# 💼 Profile Assistant – Spring Boot Backend Project

## 📌 Overview

Profile Assistant is a Spring Boot backend application that acts as an interactive professional profile. Recruiters or visitors can ask questions about my experience, skills, and projects through a chat interface, and get instant, structured answers.

This project demonstrates backend engineering skills, clean architecture, and REST API design using Java and Spring Boot — built as a live, working replacement for a static résumé.

**🔗 Live demo:** [your-render-url-here.onrender.com](https://your-render-url-here.onrender.com)

---

## 🧰 Tech Stack

* Java 17
* Spring Boot 3.5
* Spring Web
* Maven
* Lombok
* Jackson (JSON parsing)
* REST API
* Jakarta Validation
* SLF4J Logging
* Vanilla HTML/CSS/JS frontend (served by Spring Boot)
* Deployed on Render (free tier)

---

## 🚀 Features

* RESTful chat API with real conversational responses
* Structured backend architecture (Controller → Service → Handler → Repository)
* Knowledge base loaded from JSON at startup
* Chain-of-responsibility pattern for question routing (each topic has its own handler)
* Input validation
* Global exception handling
* Clean separation of concerns
* Styled chat UI served directly from Spring Boot (`/static`)
* Expandable design for AI integration (future step)

---

## 🧠 Architecture

```
Controller → ChatService → QuestionHandler (chain) → KnowledgeService → KnowledgeRepository → knowledge.json
```

Each topic (About, Skills, Career, Contact) has its own `QuestionHandler` implementation. `ChatService` loops through all handlers and returns the first one that matches the question.

Future:

```
Controller → ChatService → QuestionHandler chain → AI fallback (LLM) for unmatched questions
```

---

## 📡 API Endpoint

### Chat API

`POST /api/chat`

Request:

```json
{
  "message": "Tell me about your skills"
}
```

Response:

```json
{
  "reply": "Backend: Java, Spring Boot, REST APIs, Microservices, PostgreSQL, Hibernate, JPA\n\nCloud: AWS, Docker, CircleCI"
}
```

Topics currently supported: **about**, **skills**, **career**, **contact**.

---

## 🖥️ Running locally

```bash
./mvnw spring-boot:run
```

Then open [http://localhost:8080](http://localhost:8080) — the chat UI loads directly (served from `src/main/resources/static`).

Or test the API directly:

```bash
curl -X POST http://localhost:8080/api/chat \
  -H "Content-Type: application/json" \
  -d '{"message": "career"}'
```

---

## 🎯 Purpose of This Project

This project was built to demonstrate:

* Backend development skills
* Spring Boot architecture design
* Clean code practices (Chain of Responsibility, DTOs, layered architecture)
* Real-world API design thinking
* End-to-end ownership: backend, frontend, deployment
* A genuinely useful alternative to a static résumé for job applications

---

## 📦 Future Improvements

* AI integration (LLM fallback for unmatched questions)
* "Connect with me" feature — recruiter leaves a note, gets notified
* Docker deployment
* PostgreSQL for knowledge storage instead of static JSON
* Scheduling integration (Calendly)

---

## 👩‍💻 Author

**Hilal Ozkan**
Backend Java Developer