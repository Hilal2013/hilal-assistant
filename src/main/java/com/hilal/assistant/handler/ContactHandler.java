package com.hilal.assistant.handler;

import org.springframework.stereotype.Component;

import com.hilal.assistant.service.KnowledgeService;
import com.hilal.assistant.service.QuestionHandler;
@Component
public class ContactHandler implements QuestionHandler {
private final KnowledgeService knowledgeService;

    public ContactHandler(KnowledgeService knowledgeService) {
        this.knowledgeService = knowledgeService;
    }
    @Override
    public Boolean supports(String question) {
       String q=question.toLowerCase();
        return q.contains("...");
    }

    @Override
    public String handle() {
        return knowledgeService.getContact();
    }

}
