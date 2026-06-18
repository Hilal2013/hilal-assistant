package com.hilal.assistant.service;

import org.springframework.stereotype.Service;

@Service
public class KnowledgeService {
 public String getAbout() {

        return """
        Hi! I'm Hilal Ozkan, a Backend Java Developer specializing in
        Spring Boot, Microservices, REST APIs,PostgreSQL and cloud-based applications. Im curious, fast learner.
        That's abit about me! I'm excited to hear more about what you're looking for.
        """;
    }

    public String getSkills() {

        return "Java, Spring Boot, RESTful APIs, Microservices, PostgreSQL, Docker, CircleCI, AWS Certified";

    }

    public String getCareer() {

        return """
        I currently work as a Backend Java Developer on an Accounts Payable
        Automation platform focused on invoice processing, payment automation,
        workflow management, and REST APIs.

        Before that, I worked on an Education Management Platform where I
        developed REST APIs for student registration, course enrollment,
        and tuition payment processing.

        Earlier in my career, I also completed an internship developing
        backend services for an e-commerce application.
        """;

    }
public String getContact() {

        return """
       ...
        """;

    }

}
