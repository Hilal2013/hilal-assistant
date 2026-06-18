package com.hilal.assistant.data;

import java.util.HashMap;
import java.util.Map;

public class KnowledgeBase {
 public static final Map<String, String> ANSWERS = new HashMap<>();

    static {

        ANSWERS.put("about",
                """
                Hi! I'm Hilal Ozkan, a Backend Java Developer specializing in
                Spring Boot, Microservices, REST APIs,
                PostgreSQL and cloud-based applications.
                """);

        ANSWERS.put("skills",
                """
                Java
                Spring Boot
                Spring Security
                Microservices
                REST APIs
                PostgreSQL
                Docker
                AWS
                JUnit
                Mockito
                Git
                """);

        ANSWERS.put("experience",
                """
                I have experience developing backend services for fintech
                applications including payment automation, invoice processing,
                workflow management, and event-driven systems.
                """);

        ANSWERS.put("projects",
                """
                Personal projects include Spring Boot microservices,
                RESTful APIs, authentication, and distributed systems.
                I do not share confidential company source code.
                """);
    }
}
