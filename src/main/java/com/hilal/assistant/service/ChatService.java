package com.hilal.assistant.service;

import org.springframework.stereotype.Service;

import com.hilal.assistant.data.KnowledgeBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class ChatService {
private static final Logger log=LoggerFactory.getLogger(ChatService.class);
    public String reply(String question){

            log.info("Incoming question: {}", question);

        String q = question.toLowerCase();
    if(q.contains("about"))
            return KnowledgeBase.ANSWERS.get("about");

        if(q.contains("skill"))
            return KnowledgeBase.ANSWERS.get("skills");

        if(q.contains("experience"))
            return KnowledgeBase.ANSWERS.get("experience");

        if(q.contains("project"))
            return KnowledgeBase.ANSWERS.get("projects");
        return """
                I can answer questions about:

                • About Hilal
                • Skills
                • Experience
                • Projects

                Try asking one of those.
                """;
    }
}
