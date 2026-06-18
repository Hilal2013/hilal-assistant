package com.hilal.assistant.handler;

import org.springframework.stereotype.Component;

import com.hilal.assistant.domain.About;
import com.hilal.assistant.service.KnowledgeService;
import com.hilal.assistant.service.QuestionHandler;
@Component
public class AboutHandler implements QuestionHandler {
 private final KnowledgeService knowledgeService;

    public AboutHandler(KnowledgeService knowledgeService) {
        this.knowledgeService = knowledgeService;
    }
    @Override
    public Boolean supports(String question) {
       String q=question.toLowerCase();
        return q.contains("about Hilal") 
        || q.equals("about")
        || q.equals("about you")
         || q.contains("about yourself")
         || q.contains("who are you");
    }

    @Override
    public String handle() {
         About about =
            knowledgeService.getProfile().getAbout();

    return about.getSummary()
            + "\n\n"
            + about.getTitle()
            + "\n\n"
            + about.getLocation();
    }

}
