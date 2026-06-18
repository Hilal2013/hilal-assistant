# 💼 Profile Assistant – Spring Boot Backend Project

## 📌 Overview

Profile Assistant is a Spring Boot backend application that acts as an interactive professional profile. It allows users (recruiters or visitors) to ask questions about my experience, skills, and projects through a simple API.

This project demonstrates backend engineering skills, clean architecture, and REST API design using Java and Spring Boot.

---

## 🧰 Tech Stack

* Java 17
* Spring Boot
* Spring Web
* Maven
* REST API
* Jakarta Validation
* SLF4J Logging

---

## 🚀 Features

* RESTful chat API
* Structured backend architecture (Controller → Service → Data layer)
* Input validation
* Global exception handling
* Clean separation of concerns
* Expandable design for AI integration (future step)

---

## 🧠 Architecture

```
Controller → Service → Knowledge Base
```

Future:

```
Controller → Service → KnowledgeService → AI Service (optional)
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
  "reply": "Java, Spring Boot, Microservices..."
}
```

---

## 🎯 Purpose of This Project

This project was built to demonstrate:

* Backend development skills
* Spring Boot architecture design
* Clean code practices
* Real-world API design thinking
* Preparation for scalable system design

---

## 📦 Future Improvements

* AI integration (optional fallback)
* Frontend UI (React/Vue or simple HTML)
* Docker deployment
* Cloud hosting (Render/Vercel)
* Scheduling integration (Calendly)

---

## 👩‍💻 Author

Hilal Ozkan
Backend Java Developer
