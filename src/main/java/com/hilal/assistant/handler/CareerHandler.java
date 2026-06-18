package com.hilal.assistant.handler;

import org.springframework.stereotype.Component;

import com.hilal.assistant.domain.Career;
import com.hilal.assistant.service.KnowledgeService;
import com.hilal.assistant.service.QuestionHandler;
@Component
public class CareerHandler implements QuestionHandler {

    private final KnowledgeService knowledgeService;

    public CareerHandler(KnowledgeService knowledgeService) {
        this.knowledgeService = knowledgeService;
    }

    @Override
    public Boolean supports(String question) {
        String q=question.toLowerCase();
        return q.contains("experience")
            ||q.contains("background")
            || q.contains("career")
            || q.contains("work")
            || q.contains("job")
            || q.contains("project")
            || q.contains("current project")
            || q.contains("previous project")
            || q.contains("last project");
    }

    @Override
    public String handle() {
        Career career =
            knowledgeService.getProfile().getCareer();

    return "Current: " + career.getCurrentRole()
            + "\n\nPrevious: " + career.getPreviousRole()
            + "\n\nInternship: " + career.getInternship();
    }

}
